package AST;

import visitors.*;

public class DivisionNode extends ASTNode {
    public DivisionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public DivisionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperand) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperand);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}