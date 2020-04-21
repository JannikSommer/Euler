package AST;

import Visitors.*;

public class AssignmentNode extends ASTNode {
    public String identifier;

    public AssignmentNode(ASTNode parentNode) {
        super(parentNode);
    }

    public AssignmentNode(ASTNode parentNode, String id, ASTNode val) {
        this(parentNode);
        identifier = id;
        children.add(val);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}