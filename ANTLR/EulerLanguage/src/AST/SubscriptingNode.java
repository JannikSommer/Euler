package AST;

import Visitors.IVisitor;

import java.util.ArrayList;

public class SubscriptingNode extends ASTNode {

    public ArrayList<Integer> index;

    public SubscriptingNode(ASTNode parent, String str) {
        super(parent);
        String delimiters = "[\\[\\],]+";
        String[] tokens = str.split(delimiters);
        index = new ArrayList<>();
        for (String s: tokens) {
            if (!str.equals("")) {
                try {
                    index.add(Integer.parseInt(s));
                } catch (Exception e) {
                    // Do something
                }
            }
        }
    }

    @Override
    public void accept(IVisitor visitor) {visitor.visit(this); }
}
