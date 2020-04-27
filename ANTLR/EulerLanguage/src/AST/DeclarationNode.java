package AST;

import visitors.*;

public abstract class DeclarationNode extends StatementNode {
    public DeclarationNode(ASTNode parentNode) {
        super(parentNode);
    }

    public DeclarationNode(ASTNode parentNode, String name) {
        this(parentNode);
        children.add(new IdentificationNode(this, name));
    }

    public DeclarationNode(ASTNode parentNode, String name, ASTNode expression) {
        this(parentNode, name);
        children.add(expression);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}