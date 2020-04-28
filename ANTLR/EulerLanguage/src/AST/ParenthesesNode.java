package AST;

import visitors.IVisitor;

public class ParenthesesNode extends ExpressionNode {

    public ParenthesesNode(ASTNode parent, ASTNode child) {
        super(parent);
        children.add(child);
    }

    @Override
    public double calculateValue() {
        return ((ExpressionNode)children.get(0)).calculateValue();
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
