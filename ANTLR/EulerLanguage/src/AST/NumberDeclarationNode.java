package AST;

import Visitors.IVisitor;
import symbolTable.typeDescriptors.NumberTypeDescriptor;

public class NumberDeclarationNode extends ASTNode {
    public String identifier;

    public NumberDeclarationNode(ASTNode parent) {
        super(parent);
    }

    public NumberDeclarationNode(ASTNode parent, String id, ASTNode child) {
        super(parent);
        identifier = id;
        children.add(child);
        type = new NumberTypeDescriptor();
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
