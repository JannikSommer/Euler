package Visitors;

import AST.*;

public abstract class NodeVisitor implements IVisitor {
    public void visitChildren(ASTNode node) {
        for ( ASTNode child : node.children ) {
            child.accept(this);
        }
    }
}
