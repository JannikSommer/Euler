package AST;

import Visitors.*;

public class CodeBlockNode extends ASTNode {
    public CodeBlockNode(ASTNode parentNode) {
        super(parentNode);
        
    }
    public CodeBlockNode(ASTNode parentNode, ArrayList<ASTNode> statements) {
        this(parentNode);
        children = statements;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
   }
}