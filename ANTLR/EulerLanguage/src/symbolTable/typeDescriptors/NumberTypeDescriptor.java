package symbolTable.typeDescriptors;

public class NumberTypeDescriptor extends TypeDescriptor {
    public NumType type;

    public NumberTypeDescriptor() {
        compatibleTypes = new TypeDescriptorKind[] {TypeDescriptorKind.number};
        kind = TypeDescriptorKind.number;
    }
}
