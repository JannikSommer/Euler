package visitors.semantics;

import AST.*;
import symbolTable.typeDescriptors.ErrorTypeDescriptor;
import symbolTable.typeDescriptors.TypeDescriptorKind;
import visitors.NodeVisitor;

public class ErrorVisitor extends NodeVisitor {
    @Override
    public void visit(AdditionNode node) {
        checkError(node);
    }

    @Override
    public void visit(AppendStringNode node) {
        checkError(node);
    }

    @Override
    public void visit(AssignmentNode node) {
        checkError(node);
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        checkError(node);
    }

    @Override
    public void visit(CodeBlockNode node) {
        checkError(node);
    }

    @Override
    public void visit(DeclarationNode node) {
        checkError(node);
    }

    @Override
    public void visit(DivisionNode node) {
        checkError(node);
    }

    @Override
    public void visit(ElseIfStatementNode node) {
        checkError(node);
    }

    @Override
    public void visit(ElseStatementNode node) {
        checkError(node);
    }

    @Override
    public void visit(ErrorNode node) {
        checkError(node);
    }

    @Override
    public void visit(ExpressionNode node) {
        checkError(node);
    }

    @Override
    public void visit(IdentificationNode node) {
        checkError(node);
    }

    @Override
    public void visit(IfStatementNode node) {
        checkError(node);
    }

    @Override
    public void visit(InitializationNode node) {
        checkError(node);
    }

    @Override
    public void visit(LogicExpressionNode node) {
        checkError(node);
    }

    @Override
    public void visit(MatrixDeclarationNode node) {
        checkError(node);
    }

    @Override
    public void visit(MatrixExpressionNode node) {
        checkError(node);
    }

    @Override
    public void visit(ModuloNode node) {
        checkError(node);
    }

    @Override
    public void visit(MultiplicationNode node) {
        checkError(node);
    }

    @Override
    public void visit(NumberDeclarationNode node) {
        checkError(node);
    }

    @Override
    public void visit(NumberLiteralNode node) {
        checkError(node);
    }

    @Override
    public void visit(ParenthesesNode node) {
        checkError(node);
    }

    @Override
    public void visit(PrintNode node) {
        checkError(node);
    }

    @Override
    public void visit(ProgramNode node) {
        checkError(node);
    }

    @Override
    public void visit(ReferenceNode node) {
        checkError(node);
    }

    @Override
    public void visit(StringNode node) {
        checkError(node);
    }

    @Override
    public void visit(StringStatementNode node) {
        checkError(node);
    }

    @Override
    public void visit(SubscriptingAssignmentNode node) {
        checkError(node);
    }

    @Override
    public void visit(SubscriptingNode node) {
        checkError(node);
    }

    @Override
    public void visit(SubscriptingReferenceNode node) {
        checkError(node);
    }

    @Override
    public void visit(SubtractionNode node) {
        checkError(node);
    }

    @Override
    public void visit(ValueIndexNode node) {
        checkError(node);
    }

    @Override
    public void visit(VectorDeclarationNode node) {
        checkError(node);
    }

    @Override
    public void visit(VectorExpressionNode node) {
        checkError(node);
    }

    @Override
    public void visit(WhileNode node) {
        checkError(node);
    }

    private void checkError(ASTNode node) {
        if(node.type != null && node.type.kind == TypeDescriptorKind.error) {
            printError((ErrorTypeDescriptor) node.type);
        }
        visitChildren(node);
    }

    private void printError(ErrorTypeDescriptor error) {
        System.out.println(error.message);
    }

}
