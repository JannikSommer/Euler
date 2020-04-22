package AST;

import Visitors.IVisitor;

public class IdentificationNode extends ASTNode {
    public String identification;
    public String index;

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

    }
}
