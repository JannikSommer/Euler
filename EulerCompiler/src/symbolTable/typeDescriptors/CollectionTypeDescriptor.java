package symbolTable.typeDescriptors;

public abstract class CollectionTypeDescriptor extends TypeDescriptor {

    public CollectionTypeDescriptor(TypeDescriptorKind kind) {
        super(kind);
    }

    public CollectionTypeDescriptor(TypeDescriptorKind kind, TypeDescriptorKind elementType) {
        this(kind);
    }

    public abstract TypeDescriptor getResultType(TypeDescriptor type, String Operator);
}
