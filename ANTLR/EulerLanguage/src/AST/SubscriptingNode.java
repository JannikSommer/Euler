package AST;

import visitors.IVisitor;

public class SubscriptingNode extends ASTNode {
    public int[] index;

    public SubscriptingNode(ASTNode parent, String str) {
        super(parent);
        String delimiters = "[\\[\\]]+";
        String[] tokens = str.split(delimiters);
        index = new int[tokens.length];
        int count = 0;
        for (String s: tokens) {
            try {
                index[count] = Integer.parseInt(s);
            } catch (Exception e) {
                // Do something
            }
        }
    }

    @Override
    public void accept(IVisitor visitor) {visitor.visit(this); }
}
