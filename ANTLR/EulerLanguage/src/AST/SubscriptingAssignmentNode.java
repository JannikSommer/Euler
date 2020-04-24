package AST;

import Visitors.IVisitor;

public class SubscriptingAssignmentNode extends ASTNode {

    public SubscriptingAssignmentNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this); }
}