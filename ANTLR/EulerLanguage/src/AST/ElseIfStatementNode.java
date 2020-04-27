package AST;

import visitors.*;

public class ElseIfStatementNode extends IfStatementNode {

    public ElseIfStatementNode(ASTNode parentNode) {
        super(parentNode);
    }

    public ElseIfStatementNode(ASTNode parentNode, ASTNode condition, ASTNode body) {
        this(parentNode);
        children.add(condition);
        children.add(body);
    }

    public void accept(IVisitor visitor) {
        super.accept(visitor);
    }
}