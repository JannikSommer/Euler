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
            // TODO: Add error. Requires boolean type
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
        node.children.get(0).accept(this);
        if(node.type.isCompatible(node.children.get(0).type)) {
            node.type = node.children.get(0).type;
        } else {
            // TODO: Add error. Right hand side expression not assignable to left hand side.
            node.type = new ErrorTypeDescriptor("Right hand side expression not assignable to left hand side");
        }
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        visitChildren(node);
        if(!node.children.get(0).type.isCompatible(node.children.get(1).type)) {
            //TODO: Add Error. Incompatible types
            node.type = new ErrorTypeDescriptor("Incompatible types");
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
    public void visit(ExpressionNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(IdentificationNode node) {
        VariableAttributes attrRef = (VariableAttributes)symbolTable.retrieveSymbol(node.name);
        if(attrRef == null) {
            // TODO: Add error. this id has not been declared.
            node.type = new ErrorTypeDescriptor("Id has not been declared.");
            node.attributesRef = null;
        } else {
            node.attributesRef = attrRef;
            node.type.kind = attrRef.variableType.kind; // TODO: More checking. Maybe. Page 327
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
        visitChildren(node);
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
}
