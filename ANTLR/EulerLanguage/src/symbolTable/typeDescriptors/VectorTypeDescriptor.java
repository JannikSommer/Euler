package symbolTable.typeDescriptors;

public class VectorTypeDescriptor extends CollectionTypeDescriptor {
    public int length;

    public VectorTypeDescriptor() {
        super(TypeDescriptorKind.vector);
        compatibleTypes = new TypeDescriptorKind[] {TypeDescriptorKind.vector, TypeDescriptorKind.number};
    }

    @Override
    public boolean isCompatible(TypeDescriptor type) {
        if(super.isCompatible(type)) {
            if(type.kind == TypeDescriptorKind.number) {
                return true;
            } else if(type.kind == TypeDescriptorKind.vector) { // Vectors are only compatible if they are of same length and their elements are of the number type
                return length == ((VectorTypeDescriptor) type).length &&
                        elementType == TypeDescriptorKind.number &&
                        ((VectorTypeDescriptor) type).elementType == TypeDescriptorKind.number;
            }
        }
        return false;
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
