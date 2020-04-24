package AST;

import Visitors.IVisitor;

public class ParenthesesNode extends ASTNode {

    public ParenthesesNode(ASTNode parent, ASTNode child) {
        super(parent);
        children.add(child);
    }

    @Override
    public void accept(IVisitor visitor) {

    }
}