package symbolTable.typeDescriptors;

public class CollectionTypeDescriptor extends TypeDescriptor {
    public TypeDescriptorKind elementType;

    public CollectionTypeDescriptor(TypeDescriptorKind kind) {
        super(kind);
    }

    public CollectionTypeDescriptor(TypeDescriptorKind kind, TypeDescriptorKind elementType) {
        this(kind);
        this.elementType = elementType;
    }
}
