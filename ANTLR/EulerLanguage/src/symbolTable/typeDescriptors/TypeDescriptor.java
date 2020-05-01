package symbolTable.typeDescriptors;

public abstract class TypeDescriptor {
    public TypeDescriptorKind kind;
    public TypeDescriptorKind[] assignableTypes;

    public TypeDescriptor(TypeDescriptorKind kind) {
        this.kind = kind;
    }

    public TypeDescriptor getResultType(TypeDescriptor type, String operator) {
        return this;
    }

    public boolean canCalculate(TypeDescriptor type, String operator) {
        return isAssignable(type);
    }

    public boolean isAssignable(TypeDescriptor type) {
        for(int i = 0; i < assignableTypes.length; i++) {
            if(kind == type.kind) {
                return true;
            }
        }
        return false;
    }
}
