package AST;

import visitors.IVisitor;

public class SubscriptingAssignmentNode extends AssignmentNode {

    public SubscriptingAssignmentNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this); }
}