package AST;

import Visitors.IVisitor;

public class InitializationNode extends ASTNode {
    public String identifier;

    public InitializationNode(ASTNode parent, String id) {
        super(parent);
        identifier = id;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
