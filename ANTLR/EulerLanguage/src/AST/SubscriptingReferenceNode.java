package AST;

import visitors.IVisitor;

public class SubscriptingReferenceNode extends ExpressionNode {

    public SubscriptingReferenceNode(ASTNode parent) { super(parent);}

    @Override
    public double calculateValue() {
        return 0;
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this);}
}
