package AST;

import Visitors.IVisitor;
import symbolTable.typeDescriptors.NumberTypeDescriptor;

public class NumberDeclarationNode extends DeclarationNode {

    public NumberDeclarationNode(ASTNode parent) {
        super(parent);
    }

    public NumberDeclarationNode(ASTNode parent, String name, ASTNode expression) {
        super(parent, name, expression);
        type = new NumberTypeDescriptor();
        children.get(0).type = type;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
