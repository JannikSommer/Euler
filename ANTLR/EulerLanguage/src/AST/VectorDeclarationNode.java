package AST;

import Visitors.IVisitor;
import symbolTable.typeDescriptors.VectorTypeDescriptor;

public class VectorDeclarationNode extends ASTNode {
    public String identifier;
    public String vectorExpression;

    public VectorDeclarationNode(ASTNode parent, String id, String vecExpr) {
        super(parent);
        identifier = id;
        vectorExpression = vecExpr;
        type = new VectorTypeDescriptor(/*TODO: length, elemenType*/);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
