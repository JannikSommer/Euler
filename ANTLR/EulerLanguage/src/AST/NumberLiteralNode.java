package AST;

import symbolTable.typeDescriptors.NumberTypeDescriptor;
import visitors.IVisitor;

public class NumberLiteralNode extends ExpressionNode {
    public double value;

    public NumberLiteralNode(ASTNode parent) {
        super(parent);
        type = new NumberTypeDescriptor();
    }

    public NumberLiteralNode(ASTNode parent, double value) {
        super(parent);
        this.value = value;
        type = new NumberTypeDescriptor();
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this); }

    @Override
    public double calculateValue() {
        return value;
    }
}
