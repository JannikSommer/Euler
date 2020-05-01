package visitors.semantics;

import AST.*;
import visitors.NodeVisitor;
import symbolTable.SymbolTable;
import symbolTable.attributes.*;
import symbolTable.typeDescriptors.*;

public class SemanticsVisitor extends NodeVisitor {
    SymbolTable symbolTable;

    public SemanticsVisitor(SymbolTable symTable) {
        symbolTable = symTable;
    }

    public void checkBoolean(ASTNode node) {
        if(node.type.kind != TypeDescriptorKind.bool && node.type.kind != TypeDescriptorKind.error) {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                    " condition must be a boolean expression", node);
        }
    }

    @Override
    public void visit(AdditionNode node) {
        visit((BinaryExpressionNode)node);
    }

    @Override
    public void visit(AppendStringNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(AssignmentNode node) {
        node.children.get(0).accept(new LHSSemanticsVisitor(symbolTable));
        node.children.get(1).accept(this);
        if(node.children.get(0).type.kind == node.children.get(1).type.kind) { // Are they assignable?
            ((VariableAttributes)((IdentificationNode)node.children.get(0)).attributesRef).variableType = node.children.get(1).type;
            node.type = node.children.get(1).type;
        } else if(node.children.get(0).type.kind == TypeDescriptorKind.error || node.children.get(1).type.kind == TypeDescriptorKind.error) {
            // Do nothing. Error is described in children
        } else {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," +  "'" +
                    ((IdentificationNode)node.children.get(0)).name + "'" + " cannot be assigned value of type " + "'" +
                    node.children.get(1).type.kind.toString() + "'", node);
        }
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        visitChildren(node);
        if(!node.children.get(0).type.isCompatible(node.children.get(1).type)) {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                    " incompatible types", node);
        } else {
            node.type = node.children.get(0).type; // Add more complexity later
        }
    }

    @Override
    public void visit(CodeBlockNode node) {
        node.accept(new ReachabilityVisitor(symbolTable));
    }

    @Override
    public void visit(DeclarationNode node) {
        node.accept(new TopDeclVisitor(symbolTable));
    }

    @Override
    public void visit(DivisionNode node) {
        visit((BinaryExpressionNode)node);
    }

    @Override
    public void visit(ElseIfStatementNode node) {
        visit((IfStatementNode)node);
    }

    @Override
    public void visit(ElseStatementNode node) {
        node.accept(new ReachabilityVisitor(symbolTable));
    }

    @Override
    public void visit(ErrorNode node) {     }

    @Override
    public void visit(ExpressionNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(IdentificationNode node) {
        VariableAttributes attrRef = (VariableAttributes)symbolTable.retrieveSymbol(node.name);
        if(attrRef == null) {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                    " variable " + "'" + node.name + "'" + " has not been declared", node);
            node.attributesRef = null;
        } else {
            node.attributesRef = attrRef;
            node.type = attrRef.variableType;      // TODO: More checking. Maybe. Page 327
        }
    }

    @Override
    public void visit(IfStatementNode node) {
        visitChildren(node);
        checkBoolean(node.children.get(0));
        node.accept(new ReachabilityVisitor(symbolTable));
    }

    @Override
    public void visit(InitializationNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(LogicExpressionNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(MatrixDeclarationNode node) {
        visit((DeclarationNode)node);
    }

    @Override
    public void visit(MatrixExpressionNode node) {
        visitChildren(node);
        ((MatrixTypeDescriptor)node.type).elementType = node.children.get(0).children.get(0).type.kind;

        for (ASTNode row : node.children) {
            for (ASTNode element : row.children) {
                if(element.type.kind != ((MatrixTypeDescriptor)node.type).elementType) {
                    node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                            " matrix-expression can not contain multiple types.");
                    break;
                }
            }
        }
    }

    @Override
    public void visit(ModuloNode node) {
        visit((BinaryExpressionNode)node);
    }

    @Override
    public void visit(MultiplicationNode node) {
        visit((BinaryExpressionNode)node);
    }

    @Override
    public void visit(NumberDeclarationNode node) {
        visit((DeclarationNode)node);
    }

    @Override
    public void visit(NumberLiteralNode node) {
        node.type = new NumberTypeDescriptor();
    }

    @Override
    public void visit(ParenthesesNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(PrintNode node) {
        visitChildren(node);
        for (ASTNode child : node.children) {
            if(child instanceof ReferenceNode || child instanceof SubscriptingReferenceNode) {
                if(child.type.kind != TypeDescriptorKind.number) {
                    if(child.type.kind == TypeDescriptorKind.error) {

                    } else {
                        child.type = new ErrorTypeDescriptor("at line " + child.lineNumber + ":" + child.charPosition +
                                "," + "'" + ((IdentificationNode)child.children.get(0)).name + " ' is not of printable type");
                    }
                }
            }
        }
    }

    @Override
    public void visit(ProgramNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(StringNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(ReferenceNode node) {
        visitChildren(node);
        node.type = (node.children.get(0)).type;
    }

    @Override
    public void visit(StringStatementNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(SubscriptingAssignmentNode node) {
        visit((AssignmentNode)node);
        checkSubscript(node);

    }

    @Override
    public void visit(SubscriptingNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(SubscriptingReferenceNode node) {
        visitChildren(node);

        // Sets the reference type to be that of the vector/matrix element type. TODO: Find a better way to do this
        CollectionTypeDescriptor type = ((CollectionTypeDescriptor)((VariableAttributes)((IdentificationNode)node.children.get(0)).attributesRef).variableType);
        if(type.elementType == TypeDescriptorKind.number) {
            node.type = new NumberTypeDescriptor();
        } else if(type.elementType == TypeDescriptorKind.vector) {
            node.type = new VectorTypeDescriptor();
        } else if(type.elementType == TypeDescriptorKind.matrix) {
            node.type = new MatrixTypeDescriptor();
        }

        checkSubscript(node);
    }

    @Override
    public void visit(SubtractionNode node) {
        visit((BinaryExpressionNode)node);
    }

    @Override
    public void visit(ValueIndexNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(VectorDeclarationNode node) {
        visit((DeclarationNode)node);
    }

    @Override
    public void visit(VectorExpressionNode node) {
        visitChildren(node);
        ((VectorTypeDescriptor)node.type).elementType = node.children.get(0).type.kind;
        for (int i = 1; i < node.children.size(); i++) {
            if(node.children.get(i).type == null || node.children.get(i).type.kind == TypeDescriptorKind.error) {
                break;
            } else if(node.children.get(i).type.kind != ((VectorTypeDescriptor)node.type).elementType) {
                node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                        " vector-expression can not contain multiple types.");
                break;
            }
        }
    }

    @Override
    public void visit(WhileNode node) {
        visitChildren(node);
        checkBoolean(node.children.get(0));
        node.accept(new ReachabilityVisitor(symbolTable));
    }

    @Override
    public void visitChildren(ASTNode node) {
        if(node.children.size() != 0) {
            for ( ASTNode child : node.children ) {
                if(!child.getType().equals("ErrorNode")) { // If it has no type, it is not an errorNode. TODO: Make more efficient
                    child.accept(this);
                }
            }
        }
    }

    private void checkSubscript(ASTNode node) {
        VariableAttributes attrRef = (VariableAttributes)((IdentificationNode)node.children.get(0)).attributesRef;
        SubscriptingNode subscript = node.children.get(1).getType().equals("SubscriptingNode") ? (SubscriptingNode) node.children.get(1) : (SubscriptingNode)node.children.get(2);

        if(attrRef.variableType.kind == TypeDescriptorKind.vector || attrRef.variableType.kind == TypeDescriptorKind.matrix) {
            if(subscript.index.size() == 1 && attrRef.variableType.kind == TypeDescriptorKind.vector) {
                if(subscript.index.get(0) >= ((VectorTypeDescriptor)attrRef.variableType).length) {
                    node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                            " index out of bounds", node);
                }
            } else if(subscript.index.size() == 2 && attrRef.variableType.kind == TypeDescriptorKind.matrix) {
                if(subscript.index.get(0) >= ((MatrixTypeDescriptor)attrRef.variableType).rows) {
                    node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                            " index 1 out of bounds", node);
                } else if(subscript.index.get(1) >= ((MatrixTypeDescriptor)attrRef.variableType).columns) {
                    node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                            " index 2 out of bounds", node);
                }
            } else {
                node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                        " type does not support this number of indexes", node);
            }
        } else {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                    " type does not support subscript", node);
        }
    }


}
