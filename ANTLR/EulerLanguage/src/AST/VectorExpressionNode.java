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

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this); }

    public void getVectorElemtns(String vecExpr) {
        String delimiters = "[<,>]+";
        String[] tokens = vecExpr.split(delimiters);
        for (String str : tokens) {
            try {
                double number = Double.parseDouble(str);
                this.children.add(new NumberLiteralNode(this, number));
            } catch (Exception e) {
                this.children.add(new IdentificationNode(this, str));
            }
        }
    }
}
