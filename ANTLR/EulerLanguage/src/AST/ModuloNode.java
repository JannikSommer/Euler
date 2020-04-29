package AST;

import visitors.*;

public class ModuloNode extends BinaryExpressionNode {
    public ModuloNode(ASTNode parentNode) {
        super(parentNode);
    }

    public ModuloNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperand) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperand);
    }

    @Override
    public double calculateValue() {
        return ((ExpressionNode)children.get(0)).calculateValue() % ((ExpressionNode)children.get(1)).calculateValue();
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}