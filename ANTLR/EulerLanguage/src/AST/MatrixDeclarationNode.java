package AST;

import Visitors.IVisitor;

public class MatrixDeclarationNode extends ASTNode {
    public String identifier;
    public String matrixExpression;

    public MatrixDeclarationNode(ASTNode parent) {
        super(parent);
    }

    public MatrixDeclarationNode(ASTNode parent, String id, String mtxExpr) {
        super(parent);
        this.identifier = id;
        matrixExpression = mtxExpr;
    }

    @Override
    public void accept(IVisitor visitor) {

    }
}
