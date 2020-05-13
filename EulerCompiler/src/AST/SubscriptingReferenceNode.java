package AST;

import symbolTable.typeDescriptors.NumberTypeDescriptor;
import visitors.IVisitor;

public class SubscriptingReferenceNode extends ExpressionNode {

    public SubscriptingReferenceNode(ASTNode parent) {
        super(parent);
        type = new NumberTypeDescriptor();
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this);}
}
