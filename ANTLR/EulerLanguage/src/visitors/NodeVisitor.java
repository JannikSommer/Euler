package Visitors;

import AST.*;
import symbolTable.typeDescriptors.TypeDescriptorKind;

public abstract class NodeVisitor implements IVisitor {
    public void visitChildren(ASTNode node) {
        if(node.children.size() != 0) {
            for ( ASTNode child : node.children ) {
                child.accept(this);
            }
        }
    }

    public void visit(ASTNode node) {
        visitChildren(node);
    }
}
