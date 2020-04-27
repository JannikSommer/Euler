package AST;

public abstract class StatementNode extends ASTNode {
    public boolean isReachable;
    public boolean terminatesNormally;

    public StatementNode(ASTNode parentNode) {
        super(parentNode);
    }
}
