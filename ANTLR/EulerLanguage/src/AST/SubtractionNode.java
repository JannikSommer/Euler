package AST;

import Visitors.*;

public class SubtractionNode extends ASTNode {
    public SubtractionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public SubtractionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperand) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperand);
    }
    
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}