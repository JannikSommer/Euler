package visitors.semantics;

import AST.*;
import org.antlr.v4.tool.Attribute;
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
            node.type = new ErrorTypeDescriptor("Requires boolean type", node);
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
        if(node.children.get(0).type.isCompatible(node.children.get(1).type)) {
            node.type = node.children.get(0).type;
        } else if(node.children.get(0).type.kind == TypeDescriptorKind.error || node.children.get(1).type.kind == TypeDescriptorKind.error) {
            // Do nothing. Error is described in children
        } else {
            node.type = new ErrorTypeDescriptor("Right hand side not compatible with left hand side", node);
        }
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        visitChildren(node);
        if(!node.children.get(0).type.isCompatible(node.children.get(1).type)) {
            node.type = new ErrorTypeDescriptor("Incompatible types", node);
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
            node.type = new ErrorTypeDescriptor("Variable has not been declared", node);
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
    public void visit(VectorExpressionNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(ParenthesesNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(PrintNode node) {
        visitChildren(node);
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
    }

    @Override
    public void visit(StringStatementNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(SubscriptingAssignmentNode node) {
        visit((AssignmentNode)node);

        // Does the index exist
        VariableAttributes attrRef = (VariableAttributes)((IdentificationNode)node.children.get(0)).attributesRef;
        SubscriptingNode subscript = (SubscriptingNode)node.children.get(2);
        if(attrRef.variableType.kind == TypeDescriptorKind.vector || attrRef.variableType.kind == TypeDescriptorKind.matrix) {
            if(subscript.index.size() == 1 && attrRef.variableType.kind == TypeDescriptorKind.vector) {
                if(subscript.index.get(0) >= ((VectorTypeDescriptor)attrRef.variableType).length) {
                    node.type = new ErrorTypeDescriptor("Out of bounds", node);
                }
            } else if(subscript.index.size() == 2 && attrRef.variableType.kind == TypeDescriptorKind.matrix) {
                if(subscript.index.get(0) >= ((MatrixTypeDescriptor)attrRef.variableType).rows) {
                    node.type = new ErrorTypeDescriptor("Index 1 out of bounds", node);
                } else if(subscript.index.get(1) >= ((MatrixTypeDescriptor)attrRef.variableType).columns) {
                    node.type = new ErrorTypeDescriptor("Index 2 out of bounds", node);
                }
            } else {
                node.type = new ErrorTypeDescriptor("Type does not support this number of indexes", node);
            }
        } else {
            node.type = new ErrorTypeDescriptor("Type does not support subscript", node);
        }
    }

    @Override
    public void visit(SubscriptingNode node) {
        visitChildren(node);
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
    public void visit(WhileNode node) {
        visitChildren(node);
        checkBoolean(node.children.get(0));
        node.accept(new ReachabilityVisitor(symbolTable));
    }

    @Override
    public void visit(SubscriptingReferenceNode node) { visitChildren(node);}

    @Override
    public void visitChildren(ASTNode node) {
        if(node.children.size() != 0) {
            for ( ASTNode child : node.children ) {
                if(!child.getType().equals("ErrorNode")) {
                    child.accept(this);
                }
            }
        }
    }

}
