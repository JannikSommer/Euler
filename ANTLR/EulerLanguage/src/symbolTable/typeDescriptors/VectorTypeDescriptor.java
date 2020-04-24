package symbolTable.typeDescriptors;

public class VectorTypeDescriptor extends TypeDescriptor {
    public int length;

    public VectorTypeDescriptor() {
        super(TypeDescriptorKind.vector);
        compatibleTypes = new TypeDescriptorKind[] {TypeDescriptorKind.vector};
    }

    public VectorTypeDescriptor(int length) {
        this();
        this.length = length;
    }
}
