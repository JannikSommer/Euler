package AST;

import symbolTable.typeDescriptors.NumberTypeDescriptor;
import visitors.IVisitor;

public class SubscriptingReferenceNode extends ExpressionNode {

    public SubscriptingReferenceNode(ASTNode parent) {
        super(parent);
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this);}
}
