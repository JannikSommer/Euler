package symbolTable.typeDescriptors;

public class NumberTypeDescriptor extends TypeDescriptor {
    public NumberTypeDescriptor() {
        compatibleTypes = new TypeDescriptorKind[] {TypeDescriptorKind.number};
        kind = TypeDescriptorKind.number;
    }
}
