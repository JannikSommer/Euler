package AST;

import Visitors.*;

public class AppendStringNode extends ASTNode {
    public AppendStringNode(ASTNode parentNode) {
        super(parentNode);
    }

    public AppendStringNode(ASTNode parentNode, ASTNode value, ASTNode nextValue) {
        this(parentNode);
        children.add(value);
        children.add(nextValue);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}