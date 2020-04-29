package AST;

import visitors.IVisitor;

public class StringNode extends ASTNode {
    public String string;

    public StringNode(ASTNode parent, String str) {
        super(parent);
        string = str;
    }


    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
