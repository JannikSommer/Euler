package AST;

public abstract class ExpressionNode extends StatementNode{
    public boolean constantExpression;

    public ExpressionNode(ASTNode parentNode) {
        super(parentNode);
        terminatesNormally = true;
    }
}
