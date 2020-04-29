package AST;

import Visitors.*;

public class CodeBlockNode extends ASTNode {
    public boolean isReachable;
    public boolean terminatesNormally;

    public CodeBlockNode(ASTNode parent) {
        super(parent);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
