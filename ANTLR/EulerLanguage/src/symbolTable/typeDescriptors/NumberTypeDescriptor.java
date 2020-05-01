package symbolTable.typeDescriptors;

public class NumberTypeDescriptor extends TypeDescriptor {
    public NumberTypeDescriptor() {
        super(TypeDescriptorKind.number);
        assignableTypes = new TypeDescriptorKind[] {TypeDescriptorKind.number};
    }

    @Override
    public boolean canCalculate(TypeDescriptor type, String operator) {
        if(isAssignable(type)) {
            if(type.kind == TypeDescriptorKind.number) {
                return true;
            } else if(type.kind == TypeDescriptorKind.matrix) {
                return operator.equals("+") || operator.equals("-") || operator.equals("*");
            } else if(type.kind == TypeDescriptorKind.vector) {
                return operator.equals("+") || operator.equals("-") || operator.equals("*");
            }
        }
        return false;
    }

    @Override
    public TypeDescriptor getResultType(TypeDescriptor type, String operator) {
        if(isAssignable(type)) {
            return type;
        }
        return null;
    }
}
