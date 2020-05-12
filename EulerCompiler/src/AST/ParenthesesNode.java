package AST;

import visitors.IVisitor;

public class ParenthesesNode extends ExpressionNode {

    public ParenthesesNode(ASTNode parent) {
        super(parent);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
