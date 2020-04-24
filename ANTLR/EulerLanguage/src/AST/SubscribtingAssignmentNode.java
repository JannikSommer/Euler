package AST;

import Visitors.IVisitor;

public class SubscribtingAssignmentNode extends ASTNode {

    public SubscribtingAssignmentNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this); }
}