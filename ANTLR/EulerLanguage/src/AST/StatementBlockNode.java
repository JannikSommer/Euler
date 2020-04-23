package AST;

import Visitors.IVisitor;

import javax.swing.plaf.nimbus.State;

public class StatementBlockNode extends ASTNode {

    public StatementBlockNode(ASTNode parent) {
        super(parent);
    }


    @Override
    public void accept(IVisitor visitor) {

    }
}
