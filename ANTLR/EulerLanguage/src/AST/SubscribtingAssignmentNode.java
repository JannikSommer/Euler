package AST;

import Visitors.IVisitor;

public class SubscribtingAssignmentNode extends ASTNode {
    String identifier;

    public SubscribtingAssignmentNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {

    }
}