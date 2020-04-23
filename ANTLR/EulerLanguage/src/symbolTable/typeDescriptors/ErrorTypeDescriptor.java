package symbolTable.typeDescriptors;

public class ErrorTypeDescriptor extends TypeDescriptor {
    public String message;

    public ErrorTypeDescriptor(String message) {
        this.message = message;
        kind = TypeDescriptorKind.error;
    }
}
