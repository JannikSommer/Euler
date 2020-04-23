package AST;

import Visitors.IVisitor;

public class StringNode extends ASTNode {
    public String string;

    public StringNode(ASTNode parent, String str) {
        super(parent);
        string = str;
    }


    @Override
    public void accept(IVisitor visitor) {

    }
}
