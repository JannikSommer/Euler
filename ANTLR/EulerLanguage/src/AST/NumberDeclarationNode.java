package AST;

import Visitors.IVisitor;

public class NumberDeclarationNode extends ASTNode {
    public String identifier;

    public NumberDeclarationNode(ASTNode parent) {
        super(parent);
    }

    public NumberDeclarationNode(ASTNode parent, String id, ASTNode child) {
        super(parent);
        identifier = id;
        children.add(child);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
