package AST;

import visitors.*;

public class SubtractionNode extends BinaryExpressionNode {
    public SubtractionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public SubtractionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperand) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperand);
    }

    @Override
    public double calculateValue() {
        return ((ExpressionNode)children.get(0)).calculateValue() - ((ExpressionNode)children.get(1)).calculateValue();
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}