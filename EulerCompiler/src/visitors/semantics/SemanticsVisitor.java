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
        if(node.type.kind == TypeDescriptorKind.error) {
            // Dont check if node already contains an error.
        }else if(node.children.get(0).type.kind != TypeDescriptorKind.number ||
                node.children.get(1).type.kind != TypeDescriptorKind.number) {
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
        IdentificationNode id = (IdentificationNode)node.children.get(0);
        ASTNode expression = node.children.get(1);

        // Do Semantic-analysis on children
        visitChildren(node);

        // Check if the expression can be assigned to th variable
        if(id.type.kind == TypeDescriptorKind.error) {
            node.type = id.type;
        } else if(expression.type.kind == TypeDescriptorKind.error) {
            node.type = expression.type;
        } else if(id.type.isAssignable(expression.type)) {
            ((VariableAttributes)id.attributesRef).variableType = expression.type;
            node.type = expression.type;
        } else {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," +  "'" +
                    id.name + "'" + " cannot be assigned value of type " + "'" +
                    expression.type.kind.toString() + "'", node);
        }
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        ASTNode leftOperand = node.children.get(0);
        ASTNode rightOperand = node.children.get(1);

        // Do semantic-analysis on children
        visitChildren(node);

        // Check if operands can perform the specified operation
        if(leftOperand.type.kind == TypeDescriptorKind.error) {
            node.type = leftOperand.type;
        } else if(rightOperand.type.kind == TypeDescriptorKind.error) {
            node.type = rightOperand.type;
        } else if(!leftOperand.type.canCalculate(rightOperand.type, node.operator)) {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                    " incompatible types for '" + node.operator + "' operator", node);
        } else {
            // Calculate new type as type info might change when performing the specified operation
            node.type = leftOperand.type.getResultType(rightOperand.type, node.operator);
        }
    }

    @Override
    public void visit(CodeBlockNode node) {
        symbolTable.openScope();
        visitChildren(node);
        symbolTable.closeScope();
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
        visitChildren(node);
    }

    @Override
    public void visit(ErrorNode node) {     }

    @Override
    public void visit(ExpressionNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(IdentificationNode node) {
        // Get variable attributes from symbol-table
        VariableAttributes attrRef = (VariableAttributes)symbolTable.retrieveSymbol(node.name);

        // If no attributes are returned, the variable has not been declared
        if(attrRef == null) {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                    " variable " + "'" + node.name + "'" + " has not been declared", node);
            node.attributesRef = null;
        } else {
            // Symbol-table reference and variable-type to node
            node.attributesRef = attrRef;
            node.type = attrRef.variableType;      // TODO: More checking. Maybe. Page 327
        }
    }

    @Override
    public void visit(IfStatementNode node) {
        // Do semantic-analysis of children
        visitChildren(node);
    }

    @Override
    public void visit(InitializationNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(LogicExpressionNode node) {
        visitChildren(node);
        checkBoolean(node);
    }

    @Override
    public void visit(MatrixDeclarationNode node) {
        visit((DeclarationNode)node);
    }

    @Override
    public void visit(MatrixExpressionNode node) {
        // Do semantic-analysis of children
        visitChildren(node);

        // Must only contain numbers
        for (ASTNode row : node.children) {
            for (ASTNode element : row.children) {
                if(!(element.type instanceof ErrorTypeDescriptor)) {
                    if (element.type.kind != TypeDescriptorKind.number) {
                        node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," +
                                " matrices cannot contain elements of type '" + element.type.kind.toString() + "'");
                        break;
                    }
                }
            }
            if(node.type.kind == TypeDescriptorKind.error) {
                break;
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
        node.type = node.children.get(0).type;
    }

    @Override
    public void visit(PrintNode node) {
        // Do semantic-analysis of children
        visitChildren(node);

        // Check if references return a number as other types are not printable (yet)
        for (ASTNode child : node.children) {       // TODO: Convert to normal for loop to save one iteration
            if(child instanceof ReferenceNode || child instanceof SubscriptingReferenceNode) {
                if(child.type.kind != TypeDescriptorKind.number) {
                    if(child.type.kind == TypeDescriptorKind.error) {
                        // If the children already contain errors don't add another one. They are more specific.
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
        // Do semantic-analysis of children
        visitChildren(node);

        // Set the type of the reference as the same as the id (variable)
        node.type = (node.children.get(0)).type;
    }

    @Override
    public void visit(StringStatementNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(SubscriptingAssignmentNode node) {
        IdentificationNode id = (IdentificationNode)node.children.get(0);
        ASTNode expression = node.children.get(1);
        SubscriptingNode subscript = (SubscriptingNode) node.children.get(2);

        // Do semantic-analysis of children
        visitChildren(node);

        // Check subscript notation for errors
        if(id.type.kind != TypeDescriptorKind.error) {
            checkSubscript(node);
        }

        // Check if expression and element are of same type
        if(node.type instanceof ErrorTypeDescriptor) {
            // Already contains error
        } else if(id.type.kind == TypeDescriptorKind.error || expression.type.kind == TypeDescriptorKind.error || subscript.type != null) {
            // If the children already contain errors don't add another one. They are more specific.
        } else if(expression.type.kind == TypeDescriptorKind.number) {
            node.type = expression.type; // TODO: Might not be necessary
        } else {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," +  "'" +
                    id.name + ((SubscriptingNode)node.children.get(2)).index.toString() + "'" + " cannot be assigned value of type " + "'" +
                    expression.type.kind.toString() + "'", node);
        }
    }

    @Override
    public void visit(SubscriptingNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(SubscriptingReferenceNode node) {
        // Do semantic-analysis of children
        visitChildren(node);

        // Set type as number
        node.type = new NumberTypeDescriptor();

        // Check subscript notation for errors
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
        // Do semantic-analysis of children
        visitChildren(node);

        for (ASTNode child : node.children) {
            if(child.type.kind != TypeDescriptorKind.number) {
                node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," +
                        " vectors cannot contain elements of the type '" + child.type.kind.toString() + "'", node);
            }
            if(node.type.kind == TypeDescriptorKind.error) {
                break;
            }
        }
    }

    @Override
    public void visit(WhileNode node) {
        // Do semantic-analysis of children
        visitChildren(node);

        // Confirm that the specified condition is indeed a boolean-expression
        checkBoolean(node.children.get(0));
    }

    @Override
    public void visitChildren(ASTNode node) {
        // Iterate through all children except the one with errors
        if(node.children.size() != 0) {
            for ( ASTNode child : node.children ) {
                if(!(child.type instanceof ErrorTypeDescriptor)) { // If it has no type, it is not an errorNode.
                    child.accept(this);
                }
            }
        }
    }

    private void checkSubscript(ASTNode node) {
        // Get symbol-table data for the referenced variable
        VariableAttributes attrRef = (VariableAttributes)((IdentificationNode)node.children.get(0)).attributesRef;
        // Get reference to subscriptNode
        SubscriptingNode subscript = node.children.get(1).getType().equals("SubscriptingNode") ? (SubscriptingNode) node.children.get(1) : (SubscriptingNode)node.children.get(2);

        // TODO: Split and describe
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
