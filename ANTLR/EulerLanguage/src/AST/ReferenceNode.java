package AST;

import Visitors.IVisitor;

public class ReferenceNode extends ExpressionNode {

    public ReferenceNode(ASTNode parent) {
        super(parent);
    }

    public ReferenceNode(ASTNode parent, String name) {
        this(parent);
        children.add(new IdentificationNode(this, name));
    }

    @Override
    public double calculateValue() {
        return 0; // TODO: Find out what to put here
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
