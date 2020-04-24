package AST;

import Visitors.IVisitor;

public class VectorDeclarationNode extends ASTNode {
    public String identifier;
    public String vectorExpression;

    public VectorDeclarationNode(ASTNode parent) {
        super(parent);
    }

    public VectorDeclarationNode(ASTNode parent, String id, ASTNode child) {
        super(parent);
        identifier = id;
        this.children.add(child);
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this); }
}
