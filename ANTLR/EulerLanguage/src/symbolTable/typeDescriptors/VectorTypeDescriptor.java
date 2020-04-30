package symbolTable.typeDescriptors;

public class VectorTypeDescriptor extends CollectionTypeDescriptor {
    public int length;

    public VectorTypeDescriptor() {
        super(TypeDescriptorKind.vector);
        compatibleTypes = new TypeDescriptorKind[] {TypeDescriptorKind.vector};
    }

    @Override
    public boolean isCompatible(TypeDescriptor type) {
        return length == ((VectorTypeDescriptor) type).length && super.isCompatible(type);
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
