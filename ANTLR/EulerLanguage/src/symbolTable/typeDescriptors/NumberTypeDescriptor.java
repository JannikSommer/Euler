package symbolTable.typeDescriptors;

public class NumberTypeDescriptor extends TypeDescriptor {
    public NumberTypeDescriptor() {
        super(TypeDescriptorKind.number);
        compatibleTypes = new TypeDescriptorKind[] {TypeDescriptorKind.number};

    }
}
