package symbolTable.typeDescriptors;

public class ErrorTypeDescriptor extends TypeDescriptor {
    public String message;

    public ErrorTypeDescriptor(String message) {
        super(TypeDescriptorKind.error);
        this.message = message;

    }
}
