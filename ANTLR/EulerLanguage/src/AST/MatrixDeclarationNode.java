package AST;

import Visitors.IVisitor;

public class MatrixDeclarationNode extends ASTNode {
    public String id;
    public String matrixExpression;

    public MatrixDeclarationNode(ASTNode parent, String id, String mtxExpr) {
        super(parent);
        this.id = id;
        matrixExpression = mtxExpr;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
