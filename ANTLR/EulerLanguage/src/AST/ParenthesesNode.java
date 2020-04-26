package AST;

import Visitors.IVisitor;

public class ParenthesesNode extends ASTNode {

    public ParenthesesNode(ASTNode parent, ASTNode child) {
        super(parent);
        children.add(child);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
