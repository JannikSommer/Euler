package AST;

import Visitors.IVisitor;

public class MatrixExpressionNode extends ASTNode {

    public MatrixExpressionNode(ASTNode parent, String mtxExpr) {
        super(parent);
        getMatrixElements(mtxExpr);
    }

    private void getMatrixElements(String mtxExpr) {
        String delimiters = "[{;}]+";
        String[] tokens = mtxExpr.split(delimiters);
        for (String str : tokens) {
            this.children.add(new VectorExpressionNode(this, str));
        }
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this); }
}
