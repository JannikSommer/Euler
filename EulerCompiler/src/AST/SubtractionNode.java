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
        this.operator = "-";
    }


    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}