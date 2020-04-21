/*
package AST;

import Visitors.*;

public class StatementNode extends ASTNode {
    public StatementNode(ASTNode parentNode, ASTNode childNode){
        super(parentNode);

        if(!(childNode instanceof ExpressionNode) || !(childNode instanceof IfStatementNode) || !(childNode instanceof WhileNode) || !(childNode instanceof AssignmentNode) || !(childNode instanceof PrintNode)){
            throw new Exception("invalidType of childNode");
		}

        child = childNode;
	}

    public void accept(IVisitor visitor) {
        visitor.visit(this);
   }
}
*/