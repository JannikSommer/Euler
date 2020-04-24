package AST;


import Visitors.IVisitor;
import symbolTable.typeDescriptors.NumberTypeDescriptor;

public class NumberLiteralNode extends ASTNode {
    public double value;

    public NumberLiteralNode(ASTNode parent, double value) {
        super(parent);
        this.value = value;
        type = new NumberTypeDescriptor();
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this); }
}
