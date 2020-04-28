package symbolTable.typeDescriptors;

public abstract class TypeDescriptor {
    public TypeDescriptorKind kind;
    public TypeDescriptorKind[] compatibleTypes;

    public TypeDescriptor(TypeDescriptorKind kind) {
        this.kind = kind;
    }

    public boolean isCompatible(TypeDescriptorKind type) {
        for(int i = 0; i < compatibleTypes.length; i++) {
            if(kind == type) {
                return true;
            }
        }
        return false;
    }

    public boolean isCompatible(TypeDescriptor type) {
        for(int i = 0; i < compatibleTypes.length; i++) {
            if(kind == type.kind) {
                return true;
            }
        }
        return false;
    }
}
