package AST;

import visitors.*;

public class LogicExpressionNode extends StatementNode {
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
