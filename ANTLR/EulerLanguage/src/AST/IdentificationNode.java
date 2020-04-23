package AST;

import Visitors.IVisitor;
import symbolTable.attributes.*;
import symbolTable.typeDescriptors.TypeDescriptor;

public class IdentificationNode extends ASTNode {
    public String identification;
    public String index;
    public Attributes attributesRef;

    public IdentificationNode(ASTNode parent, String id, String index) {
        super(parent);
        identification = id;
        this.index = index;
    }

    public IdentificationNode(ASTNode parent, String id) {
        super(parent);
        identification = id;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
