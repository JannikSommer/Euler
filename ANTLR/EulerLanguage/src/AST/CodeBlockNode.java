package AST;

import visitors.*;

public class CodeBlockNode extends ASTNode {
    public CodeBlockNode(ASTNode parent) {
        super(parent);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
