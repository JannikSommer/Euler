package AST;

import Visitors.*;

public class AdditionNode extends ASTNode {
    public AdditionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public AdditionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperand) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperand);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}