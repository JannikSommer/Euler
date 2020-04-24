package AST;

import Visitors.IVisitor;
import symbolTable.typeDescriptors.VectorTypeDescriptor;

public class VectorDeclarationNode extends ASTNode {
    public String identifier;

    public VectorDeclarationNode(ASTNode parent) {
        super(parent);
    }

    public VectorDeclarationNode(ASTNode parent, String id, ASTNode child) {
        super(parent);
        identifier = id;
        type = new VectorTypeDescriptor(/*TODO: length, elemenType*/);
        this.children.add(child);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

