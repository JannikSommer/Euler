package AST;

import Visitors.IVisitor;

public class InitializationNode extends ASTNode {
    String identifier;
    @Override
    public void accept(IVisitor visitor) {

    }

    public InitializationNode(ASTNode parent, String id) {
        super(parent);
        identifier = id;
    }
}
