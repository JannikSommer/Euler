package AST;

import Visitors.IVisitor;
import symbolTable.typeDescriptors.VectorTypeDescriptor;

public class VectorDeclarationNode extends DeclarationNode {

    public VectorDeclarationNode(ASTNode parent) {
        super(parent);
    }

    public VectorDeclarationNode(ASTNode parent, String name, ASTNode expression) {
        super(parent, name, expression);
        type = new VectorTypeDescriptor(children.get(0).children.size());
        children.get(0).type = type;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

