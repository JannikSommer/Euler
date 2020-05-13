package symbolTable.typeDescriptors;

public class VectorTypeDescriptor extends CollectionTypeDescriptor {
    public int length;

    public VectorTypeDescriptor() {
        super(TypeDescriptorKind.vector);
        assignableTypes = new TypeDescriptorKind[] {TypeDescriptorKind.vector};
    }

    @Override
    public boolean canCalculate(TypeDescriptor type, String operator) {
        if(type.kind == TypeDescriptorKind.number) {
            return operator.equals("*");                                                        // Must be a valid operation
        } else if(type.kind == TypeDescriptorKind.matrix) {
            return length == ((MatrixTypeDescriptor)type).rows &&                               // The vector length must match the number of matrix rows
                    operator.equals("*");                                                       // Must be a valid operation
        } else if(type.kind == TypeDescriptorKind.vector) {
            return length == ((VectorTypeDescriptor) type).length &&                            // Must be same length
                    (operator.equals("+") || operator.equals("-") || operator.equals("*"));     // Must be a valid operation
        }
        return false;
    }

    @Override
    public TypeDescriptor getResultType(TypeDescriptor type, String operator) {
        if(canCalculate(type, operator)) {
            if(type.kind == TypeDescriptorKind.number) {
                return this;
            } else if(type.kind == TypeDescriptorKind.matrix) {
                return new VectorTypeDescriptor(((MatrixTypeDescriptor)type).columns);
            } else if(type.kind == TypeDescriptorKind.vector) {
                if(operator.equals("*")) {
                    return new NumberTypeDescriptor();
                } else if(operator.equals("+") || operator.equals("-")) {
                    return this;
                }
            }
        }
        return null;
    }

    public VectorTypeDescriptor(int length) {
        this();
        this.length = length;
    }
}
