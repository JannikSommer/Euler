package AST;

import visitors.*;
import symbolTable.typeDescriptors.BooleanTypeDescriptor;

public class LogicExpressionNode extends ExpressionNode {
    public String operator;
    public LogicExpressionNode(ASTNode parentNode) {
        super(parentNode);
        type = new BooleanTypeDescriptor();
    }


    public LogicExpressionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperands) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperands);
        type = new BooleanTypeDescriptor();
    }


    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
