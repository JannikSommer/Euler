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
        this(parent);
        this.value = value;
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this); }
}
