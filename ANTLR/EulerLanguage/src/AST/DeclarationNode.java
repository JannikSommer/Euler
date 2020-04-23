package AST;

import Visitors.*;
import symbolTable.attributes.*;
import symbolTable.typeDescriptors.MatrixTypeDescriptor;
import symbolTable.typeDescriptors.NumberTypeDescriptor;
import symbolTable.typeDescriptors.TypeDescriptor;
import symbolTable.typeDescriptors.VectorTypeDescriptor;

public class DeclarationNode extends ASTNode {
    public String identifier;
    public String matrix;
    public String vector;
    public Attributes attributesRef;
    public TypeDescriptor initType;

    public DeclarationNode(ASTNode parentNode) {
        super(parentNode);
    }

    public DeclarationNode(ASTNode parentNode, String id, ASTNode val) {
        this(parentNode);
        identifier = id;
        children.add(val);
    }

    public DeclarationNode(ASTNode parentNode, String id, String value) {
        this(parentNode);
        identifier = id;
        if (value.contains("{")) {
            matrix = value;
        }
        else {
            vector = value;
        }
    }

    public TypeDescriptor getDclType() {
        TypeDescriptor type;
        if(!vector.isEmpty()) {
            type = new VectorTypeDescriptor();
            // Add type info
        } else if(!matrix.isEmpty()) {
            type = new MatrixTypeDescriptor();
            // Add type info
        } else {
            type = new NumberTypeDescriptor();
        }
        return type;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}