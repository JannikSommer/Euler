package AST;

import Visitors.*;

public class DeclarationNode extends ASTNode {
    public String identifier;
    public String matrix;
    public String vector;

    public DeclarationNode(ASTNode parentNode) {
        super(parentNode);
    }

    public DeclarationNode(ASTNode parentNode, String id, ASTNode val) {
        this(parentNode);
        identifier = id;
        children.add(val);
    }

    public DeclarationNode(ASTNode parentNode, String id, String value) {
        this(parentNode);
        identifier = id;
        if (value.contains("{")) {
            matrix = value;
        }
        else {
            vector = value;
        }
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}