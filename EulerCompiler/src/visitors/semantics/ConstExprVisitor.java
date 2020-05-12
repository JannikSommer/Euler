package visitors.semantics;

import AST.*;
import visitors.NodeVisitor;

public class ConstExprVisitor extends NodeVisitor {
    @Override
    public void visit(AdditionNode node) {
        visit((ExpressionNode)node);
    }

    @Override
    public void visit(AppendStringNode node) {

    }

    @Override
    public void visit(AssignmentNode node) {

    }

    @Override
    public void visit(BinaryExpressionNode node) {
        visit((ExpressionNode)node);
    }

    @Override
    public void visit(CodeBlockNode node) {

    }

    @Override
    public void visit(DeclarationNode node) {

    }

    @Override
    public void visit(DivisionNode node) {
        visit((ExpressionNode)node);
    }

    @Override
    public void visit(ElseIfStatementNode node) {

    }

    @Override
    public void visit(ElseStatementNode node) {

    }

    @Override
    public void visit(ErrorNode node) {

    }

    @Override
    public void visit(ExpressionNode node) {
        for (ASTNode child :node.children) {
            child.accept(this);
            if(child instanceof ExpressionNode) {
                node.constantExpression = ((ExpressionNode) child).constantExpression;
                if(!((ExpressionNode) child).constantExpression) {
                    break;
                }
            }
        }
    }

    @Override
    public void visit(IdentificationNode node) {

    }

    @Override
    public void visit(IfStatementNode node) {

    }

    @Override
    public void visit(InitializationNode node) {

    }

    @Override
    public void visit(LogicExpressionNode node) {
        visit((ExpressionNode)node);
    }

    @Override
    public void visit(MatrixDeclarationNode node) {

    }

    @Override
    public void visit(ModuloNode node) {
        visit((ExpressionNode)node);
    }

    @Override
    public void visit(MultiplicationNode node) {
        visit((ExpressionNode)node);
    }

    @Override
    public void visit(NumberDeclarationNode node) {

    }

    @Override
    public void visit(NumberLiteralNode node) {
        node.constantExpression = true;
    }

    @Override
    public void visit(ParenthesesNode node) {
        visit((ExpressionNode)node);
    }

    @Override
    public void visit(PrintNode node) {

    }

    @Override
    public void visit(ProgramNode node) {

    }

    @Override
    public void visit(StringNode node) {

    }

    @Override
    public void visit(StringStatementNode node) {

    }

    @Override
    public void visit(SubscriptingAssignmentNode node) {

    }

    @Override
    public void visit(SubscriptingNode node) {

    }

    @Override
    public void visit(SubtractionNode node) {

    }

    @Override
    public void visit(ValueIndexNode node) {

    }

    @Override
    public void visit(VectorDeclarationNode node) {

    }

    @Override
    public void visit(VectorExpressionNode node) {

    }

    @Override
    public void visit(WhileNode node) {

    }

    @Override
    public void visit(ReferenceNode node) {

    }

    @Override
    public void visit(MatrixExpressionNode node) {

    }

    @Override
    public void visit(SubscriptingReferenceNode node) {

    }
}
