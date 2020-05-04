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
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
