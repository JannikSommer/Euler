package AST;

import Visitors.*;

public class LogicExpressionNode extends ASTNode {

    public String operator;
    public LogicExpressionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public LogicExpressionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperands) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperands);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
