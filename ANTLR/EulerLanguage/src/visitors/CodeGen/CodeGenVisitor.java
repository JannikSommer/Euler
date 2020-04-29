package visitors.CodeGen;

import symbolTable.typeDescriptors.MatrixTypeDescriptor;
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
        //TODO add FreeALLVectorsAndMatrices();
        CGSBuilder.AppendCloseMain();
        CGSBuilder.AppendFunctions();
        CGSBuilder.AppendSpace();
	}
    
    @Override
    public void visit(AdditionNode node){
        node.children.get(0).accept(this);
        currentString += " + ";
        node.children.get(1).accept(this);
    }
        
    @Override
    public void visit(AppendStringNode node){

    }

    @Override
    public void visit(AssignmentNode node){
        if(node.children.get(1) instanceof NumberLiteralNode){
            AssignNumber(node);  
        } else if(node.children.get(1) instanceof VectorExpressionNode){
            AssignVector(node);
		} else if(node.children.get(1) instanceof MatrixExpressionNode){
            AssignMatrix(node);
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

        CGSBuilder.AppendText("FreeVector(&" + name + ")\n");

        currentString = name + " = ";
        node.children.get(1).accept(this); // Create vector (VectorExpressionNode)
        CGSBuilder.AppendText(currentString);

        VectorAssignChildren(name, node.children.get(1).children);
        CGSBuilder.AppendSpace();
    }

    private void AssignMatrix(AssignmentNode node) {
        currentString = "";
        node.children.get(0).accept(this);
        String name = currentString;

        CGSBuilder.AppendText("FreeMatrix(&" + name + ")\n");

        currentString = name + " = ";
        node.children.get(1).accept(this); // Create vector (VectorExpressionNode)
        CGSBuilder.AppendText(currentString);

        MatrixAssignChildren(name, node.children.get(1).children);
        CGSBuilder.AppendSpace();
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
        
    }

    @Override
    public void visit(ElseStatementNode node){

    }

    @Override
    public void visit(ErrorNode node) {

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

    }

    @Override
    public void visit(InitializationNode node){
        node.children.get(0).accept(this);
    }

    @Override
    public void visit(LogicExpressionNode node){

    }

    @Override
    public void visit(MatrixDeclarationNode node){
        currentString = "";
        node.children.get(0).accept(this);
        currentString += " = ";
        node.children.get(1).accept(this);
        CGSBuilder.AppendText(currentString);

        currentString = "";
        node.children.get(0).accept(this); //currentString = ID
        DeclaredMatrices.add(currentString);

        MatrixAssignChildren(currentString, node.children.get(1).children);
        CGSBuilder.AppendSpace();
    }

    private void MatrixAssignChildren(String ID, ArrayList<ASTNode> children) {
        int IndexA = 0, IndexB;

        for(ASTNode Vector : children){
            IndexB = 0;
            for(ASTNode child : Vector.children){
                currentString = ID + "[" + IndexA + "][" + IndexB + "] = ";
                child.accept(this);
                CGSBuilder.AppendText(currentString);

                IndexB++;
            }
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
        //TODO add vector and matrix handling
        node.children.get(0).accept(this);
        currentString += " * ";
        node.children.get(1).accept(this);
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
        currentString += " (";
        node.children.get(0).accept(this);
        currentString += ") ";
    }

    @Override
    public void visit(PrintNode node){

    }

    @Override
    public void visit(ProgramNode node){
        node.children.get(0).accept(this);
    }
	
    @Override
    public void visit(StringNode node){
        
    }

    @Override
    public void visit(StringStatementNode node){

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
        node.children.get(0).accept(this);
        currentString += " - ";
        node.children.get(1).accept(this);
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
    }

    private void VectorAssignChildren(String ID, ArrayList<ASTNode> children){
        int Index = 0;

        for(ASTNode child : children){
            currentString = ID + "[" + Index + "] = ";
            child.accept(this);

            CGSBuilder.AppendText(currentString);
        }
    }

    @Override
    public void visit(VectorExpressionNode node){
        currentString += "CreateVector(" + node.children.size() + ");";
    }

    @Override
    public void visit(WhileNode node){
        
    }

    @Override
    public void visit(ReferenceNode node){

    }
    
    @Override
    public void visit(MatrixExpressionNode node){
        MatrixTypeDescriptor TypeDescriptor = (MatrixTypeDescriptor)node.type;
        currentString += "CreateMatrix(" + TypeDescriptor.rows + ", " + TypeDescriptor.columns + ");";
    }

    public void visit(SubscriptingReferenceNode node) {

    }
}