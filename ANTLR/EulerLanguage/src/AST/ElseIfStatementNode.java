package AST;

import Visitors.*;

public class ElseIfStatementNode extends StatementNode {

    public ElseIfStatementNode(ASTNode parentNode) {
        super(parentNode);
    }

    public ElseIfStatementNode(ASTNode parentNode, ASTNode condition, ASTNode body) {
        this(parentNode);
        children.add(condition);
        children.add(body);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}