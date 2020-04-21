package AST;

import Visitors.*;
import java.util.*;

public abstract class ASTNode {
    public ASTNode parent;
    public ArrayList<ASTNode> children; 

    public ASTNode(ASTNode parentNode) {
        parent = parentNode;
        children = new ArrayList<ASTNode>();
    }

    public abstract void accept(IVisitor visitor);

    // Should this be a string or should it return something else?
    public String getType() {
        return this.getClass().getSimpleName();
    }
}


/*
abstract class UnaryASTNode extends ASTNode {
    public ASTNode child;

    public UnaryASTNode(ASTNode parentNode) {
        super(parentNode);
    }
    
    public UnaryASTNode(ASTNode parentNode, ASTNode childNode) {
        super(parentNode);
        child = childNode;
    }
}

abstract class BinaryASTNode extends ASTNode {
    public ASTNode leftChild;
    public ASTNode rightChild;

    public BinaryASTNode(ASTNode parentNode) {
        super(parentNode);
    }

    public BinaryASTNode(ASTNode parentNode, ASTNode leftNode, ASTNode rightNode) {
        super(parentNode);
        leftChild = leftNode;
        rightChild = rightNode;
    }
}

abstract class TrinaryASTNode extends ASTNode {
    public ASTNode leftChild;
    public ASTNode middleChild;
    public ASTNode rightChild;

    public TrinaryASTNode(ASTNode parentNode) {
        super(parentNode);
    }

    public TrinaryASTNode(ASTNode parentNode, ASTNode leftNode, ASTNode middleNode, ASTNode rightNode) {
        super(parentNode);
        leftChild = leftNode;
        middleChild = middleNode;
        rightChild = rightNode;
    }
}

abstract class ListASTNode extends ASTNode {
    public ArrayList<ASTNode> children;

    // Create empty Node
    public ListASTNode(ASTNode parentNode) {
        super(parentNode);
        children = new ArrayList<ASTNode>();
    }

    // Create node with existing list
    public ListASTNode(ASTNode parentNode, ArrayList<ASTNode> childNodes)  {
        super(parentNode);
        children = childNodes;
    }
}
*/