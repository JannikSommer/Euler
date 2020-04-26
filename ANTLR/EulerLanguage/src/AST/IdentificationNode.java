package AST;

import Visitors.IVisitor;

public class IdentificationNode extends ASTNode {
    public String identification;
    public String index;
    //TODO needs second index if matrix?

    public IdentificationNode(ASTNode parent, String id, String index) {
        super(parent);
        identification = id;
        this.index = index;
    }

    public IdentificationNode(ASTNode parent, String id) {
        super(parent);
        identification = id;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
