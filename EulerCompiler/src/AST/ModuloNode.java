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
        this.operator = "%";
    }


    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}