package AST;

import Visitors.*;

public class IfStatementNode extends ASTNode {

    public IfStatementNode(ASTNode parentNode) {
        super(parentNode);
    }

    public IfStatementNode(ASTNode parentNode, ASTNode condition, ASTNode statements) {
        this(parentNode);
        children.add(condition);
        children.add(statements);
    }

    public IfStatementNode(ASTNode parentNode, ASTNode condition, ASTNode statements, ASTNode ElseStatement) {
        this(parentNode, condition, statements);
        children.add(ElseStatement);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}