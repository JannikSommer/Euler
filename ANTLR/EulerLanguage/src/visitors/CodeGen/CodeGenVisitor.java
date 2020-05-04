package visitors.CodeGen;

import symbolTable.typeDescriptors.MatrixTypeDescriptor;
import symbolTable.typeDescriptors.TypeDescriptorKind;
import visitors.IVisitor;
import AST.*;

import java.util.ArrayList;
import java.util.List;


public class CodeGenVisitor implements IVisitor {

    private CodeGenStringBuilder CGSBuilder;
    private String currentString;
    private ArrayList<String> DeclaredMatrices = new ArrayList<String>();
    private ArrayList<String> DeclaredVectors = new ArrayList<String>();

    
    public String GenerateCode(ASTNode node){
        CGSBuilder = new CodeGenStringBuilder();

        PreWork();
        node.accept(this);
        PostWork();
        return CGSBuilder.ReturnString();
	}

    private void PreWork(){
        CGSBuilder.AppendHeader();
        CGSBuilder.AppendMain();
    }

    private void PostWork(){
        FreeALLVectorsAndMatrices();
        CGSBuilder.AppendCloseMain();
        CGSBuilder.AppendSpace();
        CGSBuilder.AppendFunctions();
    }
    
    private void FreeALLVectorsAndMatrices(){
        CGSBuilder.AppendSpace();
        for(String vectorName : DeclaredVectors){
            CGSBuilder.AppendText("FreeVector(&" + vectorName + ");");
        }
        for(String matrixName : DeclaredMatrices){
            CGSBuilder.AppendText("FreeMatrix(&" + matrixName + ");");
        }
    }
    
    @Override
    public void visit(AdditionNode node){
        TypeDescriptorKind LeftChildKind = node.children.get(0).type.kind;
        TypeDescriptorKind RightChildKind = node.children.get(1).type.kind;

        if(LeftChildKind == TypeDescriptorKind.number && RightChildKind == TypeDescriptorKind.number){ //number+number
            node.children.get(0).accept(this);
            currentString += " + ";
            node.children.get(1).accept(this);
        } else if(LeftChildKind == TypeDescriptorKind.matrix && RightChildKind == TypeDescriptorKind.matrix){ //matrix+matrix
            currentString += "MatrixAddition(";
            node.children.get(0).accept(this);
            currentString += ", ";
            node.children.get(1).accept(this);
            currentString += ") ";
		} else if(LeftChildKind == TypeDescriptorKind.vector && RightChildKind == TypeDescriptorKind.vector){ //vector+vector
            currentString += "VectorAddition(";
            node.children.get(0).accept(this);
            currentString += ", ";
            node.children.get(1).accept(this);
            currentString += ") ";
		}
    }
        
    @Override
    public void visit(AppendStringNode node){
        //Never created, do nothing
    }

    @Override
    public void visit(AssignmentNode node){
        try {
            if (node.type.kind == TypeDescriptorKind.number) {
                AssignNumber(node);
            } else if (node.type.kind == TypeDescriptorKind.vector) {
                AssignVector(node);
            } else if (node.type.kind == TypeDescriptorKind.matrix) {
                AssignMatrix(node);
            }
        } catch (NullPointerException e){
            System.out.println("node.type.kind is null");
        }

    }

    private void AssignNumber(AssignmentNode node){
        currentString = "";
        node.children.get(0).accept(this);
        currentString += " = ";
        node.children.get(1).accept(this);
        currentString += ";";
        CGSBuilder.AppendText(currentString);
    }
    
    private void AssignVector(AssignmentNode node) {
        currentString = "";
        node.children.get(0).accept(this);
        String name = currentString;
        
        if(node.children.get(1) instanceof VectorExpressionNode){
            CGSBuilder.AppendText("FreeVector(&" + name + ");");

            currentString = name + " = ";
            node.children.get(1).accept(this); // Create vector (VectorExpressionNode)
            CGSBuilder.AppendText(currentString);

            VectorAssignChildren(name, node.children.get(1).children);
            CGSBuilder.AppendSpace();
        } else{
            CGSBuilder.AppendText("num = (int*)&" + name + ";");

            currentString = name + " = ";
            node.children.get(1).accept(this);
            currentString += ";";
            CGSBuilder.AppendText(currentString);

            CGSBuilder.AppendText("FreeVector((Vector*)num);");
		}
    }

    private void AssignMatrix(AssignmentNode node) {
        currentString = "";
        node.children.get(0).accept(this);
        String name = currentString;
        
        if(node.children.get(1) instanceof MatrixExpressionNode){
            CGSBuilder.AppendText("FreeMatrix(&" + name + ");");

            currentString = name + " = ";
            node.children.get(1).accept(this); // Create vector (VectorExpressionNode)
            CGSBuilder.AppendText(currentString);

            MatrixAssignChildren(name, node.children.get(1).children);
            CGSBuilder.AppendSpace();
        } else{
            CGSBuilder.AppendText("num = (int*)&" + name + ";");

            currentString = name + " = ";
            node.children.get(1).accept(this); // Create vector (VectorExpressionNode)
            currentString += ";";
            CGSBuilder.AppendText(currentString);

            CGSBuilder.AppendText("FreeMatrix((Matrix*)num);");
		}
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        //Abstract class, do nothing
    }

    @Override
    public void visit(CodeBlockNode node){
        for(ASTNode child : node.children){
            child.accept(this);  
		}
    }

    @Override
    public void visit(DeclarationNode node) {
        //Abstract class, do nothing
    }

    @Override
    public void visit(DivisionNode node){
        node.children.get(0).accept(this);
        currentString += " / ";
        node.children.get(1).accept(this);
    }

    @Override
    public void visit(ElseIfStatementNode node){
        currentString = "else if(";
        node.children.get(0).accept(this);
        currentString += "){";
        CGSBuilder.AppendText(currentString);
        CGSBuilder.IncreaseIndent();

        node.children.get(1).accept(this);

        CGSBuilder.DecreaseIndent();
        CGSBuilder.AppendText("}");
    }

    @Override
    public void visit(ElseStatementNode node){
        for(ASTNode child : node.children){
            if(child instanceof ElseIfStatementNode){ // else if
                child.accept(this);
            }
            else if(child instanceof CodeBlockNode){ //else
                CGSBuilder.AppendText("else{");
                CGSBuilder.IncreaseIndent();
                child.accept(this);
                CGSBuilder.DecreaseIndent();
                CGSBuilder.AppendText("}");
            }
		}
    }

    @Override
    public void visit(ErrorNode node) {
            //Error, do nothing
    }

    @Override
    public void visit(ExpressionNode node) {
        //Abstract class, do nothing
    }

    @Override
    public void visit(IdentificationNode node){
        currentString += node.name;
    }

    @Override
    public void visit(IfStatementNode node){
        CGSBuilder.AppendSpace();
        currentString = "if(";
        node.children.get(0).accept(this);
        currentString += "){";
        CGSBuilder.AppendText(currentString);

        CGSBuilder.IncreaseIndent();
    
        node.children.get(1).accept(this);

        CGSBuilder.DecreaseIndent();
        CGSBuilder.AppendText("}");
    
        if(node.children.size() == 3){
            node.children.get(2).accept(this);
        }
    }

    @Override
    public void visit(InitializationNode node){
        node.children.get(0).accept(this);
    }

    @Override
    public void visit(LogicExpressionNode node){
        node.children.get(0).accept(this);
        currentString += node.operator;
        node.children.get(1).accept(this);
    }

    @Override
    public void visit(MatrixDeclarationNode node){
        if(node.children.get(1) instanceof MatrixExpressionNode){
            currentString = "Matrix ";
            node.children.get(0).accept(this);
            currentString += " = ";
            node.children.get(1).accept(this);
            CGSBuilder.AppendText(currentString);

            currentString = "";
            node.children.get(0).accept(this); //currentString = ID
            DeclaredMatrices.add(currentString);

            MatrixAssignChildren(currentString, node.children.get(1).children);
            CGSBuilder.AppendSpace();
        } else{
            currentString = "Matrix ";
            node.children.get(0).accept(this);
            currentString += " = ";
            node.children.get(1).accept(this);
            currentString += ";";
            CGSBuilder.AppendText(currentString);
		}
    }

    private void MatrixAssignChildren(String ID, ArrayList<ASTNode> children) {
        int IndexA = 0, IndexB;

        for(ASTNode Vector : children){
            IndexB = 0;
            currentString = "";
            for(ASTNode child : Vector.children){
                currentString += ID + ".elements[" + IndexA + "][" + IndexB + "] = ";
                child.accept(this);
                currentString += "; ";
                IndexB++;
            }
            CGSBuilder.AppendText(currentString);
            IndexA++;
        }
    }

    @Override
    public void visit(ModuloNode node){
        node.children.get(0).accept(this);
        currentString += " % ";
        node.children.get(1).accept(this);
    }
    
    @Override
    public void visit(MultiplicationNode node){
        TypeDescriptorKind LeftChildKind = node.children.get(0).type.kind;
        TypeDescriptorKind RightChildKind = node.children.get(1).type.kind;

        if(LeftChildKind == TypeDescriptorKind.number && RightChildKind == TypeDescriptorKind.number){ //number*number
            node.children.get(0).accept(this);
            currentString += " * ";
            node.children.get(1).accept(this);
		} else if(LeftChildKind == TypeDescriptorKind.matrix && RightChildKind == TypeDescriptorKind.matrix){ //matrix*matrix
            currentString += "MatrixMatrixMultiplication(";
            node.children.get(0).accept(this);
            currentString += ", ";
            node.children.get(1).accept(this);
            currentString += ")";
		} else if(LeftChildKind == TypeDescriptorKind.vector && RightChildKind == TypeDescriptorKind.matrix){ //vector*matrix
            currentString += "VectorMatrixMultiplication(";
            node.children.get(0).accept(this);
            currentString += ", ";
            node.children.get(1).accept(this);
            currentString += ")";
        } else if(LeftChildKind == TypeDescriptorKind.matrix && RightChildKind == TypeDescriptorKind.vector){ //matrix*vector
            currentString += "MatrixVectorMultiplication(";
            node.children.get(0).accept(this);
            currentString += ", ";
            node.children.get(1).accept(this);
            currentString += ")";
        } else if(LeftChildKind == TypeDescriptorKind.vector && RightChildKind == TypeDescriptorKind.vector){ //vector*vector (dot product)
            currentString += "DotProduct(";
            node.children.get(0).accept(this);
            currentString += ", ";
            node.children.get(1).accept(this);
            currentString += ")";
        } else if(LeftChildKind == TypeDescriptorKind.vector && RightChildKind == TypeDescriptorKind.number){ //vector*number
            currentString += "VectorScalar(";
            node.children.get(0).accept(this);
            currentString += ", ";
            node.children.get(1).accept(this);
            currentString += ")";
        } else if(LeftChildKind == TypeDescriptorKind.number && RightChildKind == TypeDescriptorKind.vector){ //number*vector (inverted)
            currentString += "VectorScalar(";
            node.children.get(1).accept(this);
            currentString += ", ";
            node.children.get(0).accept(this);
            currentString += ")";
        } else if(LeftChildKind == TypeDescriptorKind.matrix && RightChildKind == TypeDescriptorKind.number){ //matrix*number
            currentString += "MatrixScalar(";
            node.children.get(0).accept(this);
            currentString += ", ";
            node.children.get(1).accept(this);
            currentString += ")";
        } else if(LeftChildKind == TypeDescriptorKind.number && RightChildKind == TypeDescriptorKind.matrix){ //number*matrix (inverted)
            currentString += "MatrixScalar(";
            node.children.get(1).accept(this);
            currentString += ", ";
            node.children.get(0).accept(this);
            currentString += ")";
        } 
    }

    @Override
    public void visit(NumberDeclarationNode node){
        currentString = "double ";
        node.children.get(0).accept(this); //IdentificationNode
        currentString += " = ";
        node.children.get(1).accept(this); //number or referance
        currentString += ";";
        CGSBuilder.AppendText(currentString);
    }

    @Override
    public void visit(NumberLiteralNode node){
        currentString += node.value;
    }

    @Override
    public void visit(ParenthesesNode node){
        currentString += "(";
        node.children.get(0).accept(this);
        currentString += ")";
    }

    @Override
    public void visit(PrintNode node){
        currentString = "printf(\"";
        ArrayList<String> IDs = new ArrayList<String>();

        for(ASTNode child : node.children){
            if(child instanceof StringNode){
                child.accept(this);
            }
            else if(child instanceof ReferenceNode){
                currentString += "%0.2f";
                IdentificationNode IDNode = (IdentificationNode) child.children.get(0);
                IDs.add(IDNode.name);
            }
            else if(child instanceof NumberLiteralNode){
                child.accept(this);
            }
            else if(child instanceof SubscriptingReferenceNode){
                currentString += "%0.2f";
                IDs.add(GetIDandSubscript((SubscriptingReferenceNode)child));
            }
        }

        currentString += "\\n\"";
        for(String ID : IDs){
            currentString += ", " + ID;  
		}
        currentString += ");";

        CGSBuilder.AppendText(currentString);
        CGSBuilder.AppendSpace();
    }

    private String GetIDandSubscript(SubscriptingReferenceNode node){
        IdentificationNode IDNode = (IdentificationNode)node.children.get(0);
        String result = IDNode.name + ".elements";

        SubscriptingNode SubScriptNode = (SubscriptingNode)node.children.get(1);
        for(int index : SubScriptNode.index){
            result += "[" + index + "]";
		}
        return result;
	}

    @Override
    public void visit(ProgramNode node){
        node.children.get(0).accept(this);
    }
	
    @Override
    public void visit(StringNode node){
        String string = node.string.substring(1, node.string.length() - 1);
        string = string.replace("%", "%%");
        currentString += string;
    }

    @Override
    public void visit(StringStatementNode node){
        //Never created, do nothing;
    }

    @Override
    public void visit(SubscriptingAssignmentNode node){
        currentString = "";
        node.children.get(0).accept(this);
        node.children.get(1).accept(this);
        currentString += " = ";
        node.children.get(2).accept(this);
        currentString += ";";
        CGSBuilder.AppendText(currentString);
    }

    @Override
    public void visit(SubscriptingNode node){
        for(int index : node.index){
            currentString += "[" + index + "]";
		}
    }

    @Override
    public void visit(SubtractionNode node){
        TypeDescriptorKind LeftChildKind = node.children.get(0).type.kind;
        TypeDescriptorKind RightChildKind = node.children.get(1).type.kind;

        if(LeftChildKind == TypeDescriptorKind.number && RightChildKind == TypeDescriptorKind.number){ //number-number
            node.children.get(0).accept(this);
            currentString += " - ";
            node.children.get(1).accept(this);
        } else if(LeftChildKind == TypeDescriptorKind.matrix && RightChildKind == TypeDescriptorKind.matrix){ //matrix-matrix
            currentString += "MatrixSubtraction(";
            node.children.get(0).accept(this);
            currentString += ", ";
            node.children.get(1).accept(this);
            currentString += ")";
		} else if(LeftChildKind == TypeDescriptorKind.vector && RightChildKind == TypeDescriptorKind.vector){ //vector-vector
            currentString += "VectorSubtraction(";
            node.children.get(0).accept(this);
            currentString += ", ";
            node.children.get(1).accept(this);
            currentString += ")";
		}
    }
    
    @Override
    public void visit(ValueIndexNode node){
        currentString += "[" + node.indexA + "]";
        if(node.indexB != -1){
            currentString += "[" + node.indexB + "]";
		}
    }

    @Override
    public void visit(VectorDeclarationNode node){
        if(node.children.get(1) instanceof VectorExpressionNode){
            currentString = "Vector ";
            node.children.get(0).accept(this);
            currentString += " = ";
            node.children.get(1).accept(this); // Create vector (VectorExpressionNode)
            CGSBuilder.AppendText(currentString);

            currentString = "";
            node.children.get(0).accept(this); //currentString = ID
            DeclaredVectors.add(currentString);

            VectorAssignChildren(currentString, node.children.get(1).children);
            CGSBuilder.AppendSpace();
        } else{
            currentString = "Vector ";
            node.children.get(0).accept(this);
            currentString += " = ";
            node.children.get(1).accept(this);
            currentString += ";";
            CGSBuilder.AppendText(currentString);
		}
    }

    private void VectorAssignChildren(String ID, ArrayList<ASTNode> children){
        int Index = 0;
        currentString = "";

        for(ASTNode child : children){
            currentString += ID + ".elements[" + Index + "] = ";
            child.accept(this);
            currentString += "; ";
            Index++;
        }
        CGSBuilder.AppendText(currentString);
    }

    @Override
    public void visit(VectorExpressionNode node){
        currentString += "CreateVector(" + node.children.size() + ");";
    }

    @Override
    public void visit(WhileNode node){
        currentString = "while(";
        node.children.get(0).accept(this);
        currentString += "){";
        CGSBuilder.AppendText(currentString);
        CGSBuilder.IncreaseIndent();

        node.children.get(1).accept(this);

        CGSBuilder.DecreaseIndent();
        CGSBuilder.AppendText("}");
    }

    @Override
    public void visit(ReferenceNode node){
        node.children.get(0).accept(this);
    }
    
    @Override
    public void visit(MatrixExpressionNode node){
        MatrixTypeDescriptor TypeDescriptor = (MatrixTypeDescriptor)node.type;
        currentString += "CreateMatrix(" + TypeDescriptor.rows + ", " + TypeDescriptor.columns + ");";
    }

    public void visit(SubscriptingReferenceNode node) {
        for(ASTNode child : node.children){
            child.accept(this);  
		}
    }
}