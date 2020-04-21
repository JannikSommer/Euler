package AST;

import Visitors.*;

public class PrintNode extends ASTNode {
    public PrintNode(ASTNode parentNode) {
        super(parentNode);
    }
    public PrintNode(ASTNode parentNode, StringStatementNode string) {
        this(parentNode);
        children.add(string);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
   }
}