package symbolTable.typeDescriptors;

public class VectorTypeDescriptor extends TypeDescriptor {
    public int length;
    public TypeDescriptorKind elementType;

    public VectorTypeDescriptor() {
        super(TypeDescriptorKind.vector);
        compatibleTypes = new TypeDescriptorKind[] {TypeDescriptorKind.vector};
    }

    public VectorTypeDescriptor(int length) {
        this();
        this.length = length;
    }

    public VectorTypeDescriptor(int length, TypeDescriptorKind elementType) {
        this(length);
        this.elementType = elementType;
    }
}
