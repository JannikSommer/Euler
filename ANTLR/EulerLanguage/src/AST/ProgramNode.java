package AST;

import Visitors.*;

public class ProgramNode extends ASTNode {
    public ProgramNode(ASTNode parentNode) {
        super(null);
    }

    public ProgramNode(ASTNode parentNode, ASTNode declarations, ASTNode statements) {
        this(parentNode)
        children.add(declarations);
        children.add(statements);
    }
    
    public void accept(IVisitor visitor) {
        visitor.visit(this);
   }
}