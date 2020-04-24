package symbolTable.typeDescriptors;

public class VectorTypeDescriptor extends TypeDescriptor {
    public int length;
    public TypeDescriptorKind elementType; // Is this necessary?

    public VectorTypeDescriptor() {
        compatibleTypes = new TypeDescriptorKind[] {TypeDescriptorKind.vector};
        kind = TypeDescriptorKind.vector;
    }

    public VectorTypeDescriptor(int length, TypeDescriptorKind type) {
        this();
        this.length = length;
        this.elementType = type;
    }
}
