package AST;

import Visitors.*;
import symbolTable.attributes.*;
import symbolTable.typeDescriptors.*;

public class DeclarationNode extends ASTNode {
    public String identifier;
    public Attributes attributesRef;

    public DeclarationNode(ASTNode parentNode) {
        super(parentNode);
    }

    public DeclarationNode(ASTNode parentNode, String id, ASTNode val) {
        this(parentNode);
        identifier = id;
        children.add(val);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}