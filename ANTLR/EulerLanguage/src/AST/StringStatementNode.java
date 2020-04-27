package AST;

import Visitors.*;

public class StringStatementNode extends StatementNode {
    public StringStatementNode(ASTNode parentNode) {
        super(parentNode);
    }

    public StringStatementNode(ASTNode parentNode, ASTNode value, ASTNode appendString) {
        this(parentNode);
        children.add(value);
        children.add(appendString);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
   }
}