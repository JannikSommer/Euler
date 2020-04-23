package AST;

import Visitors.*;

public class AssignmentNode extends ASTNode {
    public String identifier;
    public String valIndex;

    public AssignmentNode(ASTNode parentNode) {
        super(parentNode);
    }

    public AssignmentNode(ASTNode parentNode, String id, ASTNode val) {
        this(parentNode);
        identifier = id;
        children.add(val);
    }

    public AssignmentNode(ASTNode parent, String id, String valIndex, ASTNode child) {
        super(parent);
        identifier = id;
        this.valIndex = valIndex;
        children.add(child);
    }



    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}