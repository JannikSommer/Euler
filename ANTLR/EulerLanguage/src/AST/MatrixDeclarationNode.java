package AST;

import Visitors.IVisitor;
import symbolTable.typeDescriptors.MatrixTypeDescriptor;

public class MatrixDeclarationNode extends DeclarationNode {
    public String matrixExpression;

    public MatrixDeclarationNode(ASTNode parent, String id, String mtxExpr) {
        super(parent);
        this.identifier = id;
        matrixExpression = mtxExpr;
        type = new MatrixTypeDescriptor(/*TODO: rows, columns*/);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
