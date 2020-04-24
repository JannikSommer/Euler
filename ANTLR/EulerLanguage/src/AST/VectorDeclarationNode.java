package AST;

import Visitors.IVisitor;

public class VectorDeclarationNode extends ASTNode {
    public String identifier;
    public String vectorExpression;

    public VectorDeclarationNode(ASTNode parent, String id, String vecExpr) {
        super(parent);
        identifier = id;
        vectorExpression = vecExpr;
    }

    @Override
    public void accept(IVisitor visitor) {

    }
}
