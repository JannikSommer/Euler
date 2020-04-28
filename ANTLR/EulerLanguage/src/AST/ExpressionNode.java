package AST;

public abstract class ExpressionNode extends StatementNode{
    public double exprValue = 0;

    public ExpressionNode(ASTNode parentNode) {
        super(parentNode);
        terminatesNormally = true;
    }

    public abstract double calculateValue(); // TODO: Investigate possible stack overflow
}
