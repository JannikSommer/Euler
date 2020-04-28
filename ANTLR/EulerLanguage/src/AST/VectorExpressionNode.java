package AST;

import visitors.IVisitor;
import java.lang.*;

public class VectorExpressionNode extends ASTNode {

    public VectorExpressionNode(ASTNode parentNode, String vecExpr) {
        super(parentNode);
        getVectorElements(vecExpr);
    }

    private void getVectorElements(String vecExpr) {
        String delimiters = "[<,>\n\t ]+";
        String[] tokens = vecExpr.split(delimiters);
        for (String str : tokens) {
            if(str.matches("\\d")) { // TODO: Check effeciency and if it should be more thorough.
                double number = Double.parseDouble(str);
                this.children.add(new NumberLiteralNode(this, number));
            } else {
                if (!str.equals("")) {
                    this.children.add(new ReferenceNode(this, str));
                }
            }
        }
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
