package AST;

import visitors.IVisitor;

public class ParenthesesNode extends ExpressionNode {

    public ParenthesesNode(ASTNode parent, ASTNode child) {
        super(parent);
        children.add(child);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
