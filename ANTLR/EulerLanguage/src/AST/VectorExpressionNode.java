package AST;

import Visitors.IVisitor;
import java.lang.*;
import java.util.*;

import java.util.ArrayList;

public class VectorExpressionNode extends ASTNode {

    public VectorExpressionNode(ASTNode parentNode, String vecExpr) {
        super(parentNode);
        getVectorElemtns(vecExpr);
    }

    public void getVectorElemtns(String vecExpr) {
        String delimiters = "[<,>]+";
        String[] tokens = vecExpr.split(delimiters);
        for (String str : tokens) {
            if(str.matches("\\d")) { // TODO: Check effeciency and if it should be more thorough.
                double number = Double.parseDouble(str);
                this.children.add(new NumberLiteralNode(this, number));
            } else {
                this.children.add(new IdentificationNode(this, str));
            }
        }
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
