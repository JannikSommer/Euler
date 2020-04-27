package AST;

import Visitors.*;
import java.util.*;
import javax.swing.plaf.nimbus.State;

public class CodeBlockNode extends ASTNode {

    public CodeBlockNode(ASTNode parent) {
        super(parent);
    }


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}