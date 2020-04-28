package AST;

import visitors.IVisitor;

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
        return ((ExpressionNode)children.get(0)).calculateValue() / ((ExpressionNode)children.get(0)).calculateValue();
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
