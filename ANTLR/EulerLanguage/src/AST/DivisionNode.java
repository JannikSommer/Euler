package AST;

import visitors.*;

public class DivisionNode extends BinaryExpressionNode {
    public DivisionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public DivisionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperand) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperand);
        this.operator = "/";
    }


    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}