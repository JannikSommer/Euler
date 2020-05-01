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

    @Override
    public double calculateValue() {
        return ((ExpressionNode)children.get(0)).calculateValue() / ((ExpressionNode)children.get(1)).calculateValue();
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}