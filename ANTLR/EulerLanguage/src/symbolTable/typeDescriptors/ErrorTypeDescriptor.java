package symbolTable.typeDescriptors;

import AST.ASTNode;

public class ErrorTypeDescriptor extends TypeDescriptor {
    public String message;
    public ASTNode reference;

    public ErrorTypeDescriptor(String message) {
        super(TypeDescriptorKind.error);
        this.message = message;
        compatibleTypes = new TypeDescriptorKind[] {TypeDescriptorKind.error};
    }
    
    public ErrorTypeDescriptor(String message, ASTNode reference) {
        this(message);
        this.reference = reference;
    }
}
