package AST;

import Visitors.IVisitor;
import symbolTable.attributes.*;

public class IdentificationNode extends ASTNode {
    public String name;
    public Attributes attributesRef;

    public IdentificationNode(ASTNode parent) {
        super(parent);
    }

    public IdentificationNode(ASTNode parent, String name) {
        this(parent);
        this.name = name;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
