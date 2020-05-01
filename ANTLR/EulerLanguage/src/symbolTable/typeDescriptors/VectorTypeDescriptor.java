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
                    elementType == TypeDescriptorKind.number &&                                 // Both the vector and the matrix may only contain numbers
                    ((MatrixTypeDescriptor)type).elementType == TypeDescriptorKind.number
                    && operator.equals("*");                                                    // Must be a valid operation
        } else if(type.kind == TypeDescriptorKind.vector) {
            return length == ((VectorTypeDescriptor) type).length &&                            // Must be same length
                    elementType == TypeDescriptorKind.number &&                                 // Both vectors may only contain numbers
                    ((VectorTypeDescriptor) type).elementType == TypeDescriptorKind.number &&
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
                return new VectorTypeDescriptor(((MatrixTypeDescriptor)type).columns, elementType);
            } else if(type.kind == TypeDescriptorKind.vector) {
                return this;
            }
        }
        return null;
    }

    public VectorTypeDescriptor(int length) {
        this();
        this.length = length;
    }

    public VectorTypeDescriptor(int length, TypeDescriptorKind elementType) {
        this(length);
        this.elementType = elementType;
    }
}
