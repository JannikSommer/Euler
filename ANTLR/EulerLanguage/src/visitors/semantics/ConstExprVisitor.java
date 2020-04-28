package visitors.semantics;

import AST.*;
import visitors.NodeVisitor;

public class ConstExprVisitor extends NodeVisitor {
    @Override
    public void visit(AdditionNode node) {

    }

    @Override
    public void visit(AppendStringNode node) {

    }

    @Override
    public void visit(AssignmentNode node) {

    }

    @Override
    public void visit(BinaryExpressionNode node) {
        // TODO: Take a look at this again
        if(node.children.get(0).getType().equals("NumberLiteralNode") && node.children.get(1).getType().equals("NumberLiteralNode")) {
            node.exprValue = node.calculateValue();
        }
    }

    @Override
    public void visit(CodeBlockNode node) {

    }

    @Override
    public void visit(DeclarationNode node) {

    }

    @Override
    public void visit(DivisionNode node) {

    }

    @Override
    public void visit(ElseIfStatementNode node) {

    }

    @Override
    public void visit(ElseStatementNode node) {

    }

    @Override
    public void visit(ExpressionNode node) {

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
        if(node.children.get(0).getType().equals("NumberLiteralNode") && node.children.get(1).getType().equals("NumberLiteralNode")) {
            node.exprValue = node.calculateValue();
        }
    }

    @Override
    public void visit(MatrixDeclarationNode node) {

    }

    @Override
    public void visit(ModuloNode node) {

    }

    @Override
    public void visit(MultiplicationNode node) {

    }

    @Override
    public void visit(NumberDeclarationNode node) {

    }

    @Override
    public void visit(NumberLiteralNode node) {

    }

    @Override
    public void visit(ParenthesesNode node) {

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
}
