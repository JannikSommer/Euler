package AST;

import Visitors.IVisitor;

public class NumberLiteralNode extends ASTNode {
    public double value;

    public NumberLiteralNode(ASTNode parent, double value) {
        super(parent);
        this.value = value;
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this); }
}
