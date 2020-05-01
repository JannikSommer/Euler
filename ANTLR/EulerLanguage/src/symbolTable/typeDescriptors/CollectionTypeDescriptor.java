package symbolTable.typeDescriptors;

public abstract class CollectionTypeDescriptor extends TypeDescriptor {
    public TypeDescriptorKind elementType;

    public CollectionTypeDescriptor(TypeDescriptorKind kind) {
        super(kind);
    }

    public CollectionTypeDescriptor(TypeDescriptorKind kind, TypeDescriptorKind elementType) {
        this(kind);
        this.elementType = elementType;
    }

    public abstract TypeDescriptor getResultType(TypeDescriptor type, String Operator);
}
