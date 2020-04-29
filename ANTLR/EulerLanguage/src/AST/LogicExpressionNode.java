package AST;

import Visitors.*;
import symbolTable.typeDescriptors.BooleanTypeDescriptor;

public class LogicExpressionNode extends ASTNode {
    public String operator;
    public boolean exprValue;
    public LogicExpressionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public LogicExpressionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperands) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperands);
        type = new BooleanTypeDescriptor();
    }


    public boolean calculateValue() { // TODO: Might want to add different nodes instead
        if(operator.equals("==")) {
            return ((ExpressionNode)children.get(0)).calculateValue() == ((ExpressionNode)children.get(1)).calculateValue();
        } else if(operator.equals("<")) {
            return ((ExpressionNode)children.get(0)).calculateValue() < ((ExpressionNode)children.get(1)).calculateValue();
        } else if(operator.equals(">")) {
            return ((ExpressionNode)children.get(0)).calculateValue() > ((ExpressionNode)children.get(1)).calculateValue();
        } else if(operator.equals("!=")) {
            return ((ExpressionNode)children.get(0)).calculateValue() != ((ExpressionNode)children.get(1)).calculateValue();
        } else if(operator.equals("<=")) {
            return ((ExpressionNode)children.get(0)).calculateValue() <= ((ExpressionNode)children.get(1)).calculateValue();
        } else if(operator.equals(">=")) {
            return ((ExpressionNode)children.get(0)).calculateValue() >= ((ExpressionNode)children.get(1)).calculateValue();
        } else {
            return false; // TODO: Add something here
        }
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
