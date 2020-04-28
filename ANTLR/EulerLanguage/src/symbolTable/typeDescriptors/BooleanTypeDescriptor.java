package symbolTable.typeDescriptors;

public class BooleanTypeDescriptor extends TypeDescriptor{

    public BooleanTypeDescriptor() {
        super(TypeDescriptorKind.bool);
        compatibleTypes = new TypeDescriptorKind[] {TypeDescriptorKind.bool};
    }
}
