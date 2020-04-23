package symbolTable.typeDescriptors;

public class VectorTypeDescriptor extends TypeDescriptor {
    public int length;
    public TypeDescriptor elementType; // Is this necessary?

    public VectorTypeDescriptor() {
        compatibleTypes = new TypeDescriptorKind[] {TypeDescriptorKind.vector};
        kind = TypeDescriptorKind.vector;
    }
}
