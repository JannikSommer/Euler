package AST;

import visitors.IVisitor;
import symbolTable.typeDescriptors.MatrixTypeDescriptor;

public class MatrixDeclarationNode extends DeclarationNode {

    public MatrixDeclarationNode(ASTNode parent) {
        super(parent);
        type = new MatrixTypeDescriptor();
    }

    public MatrixDeclarationNode(ASTNode parent, String name, String mtxExpr) {
        super(parent, name);
        children.add(new MatrixExpressionNode(this, mtxExpr));
        type = new MatrixTypeDescriptor(children.get(0).children.size(),        // Number of rows
                ((MatrixExpressionNode)children.get(0)).getNumberOfColumns());  // Number of columns
        children.get(0).type = type;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
