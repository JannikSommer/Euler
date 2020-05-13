package symbolTable.typeDescriptors;

public class MatrixTypeDescriptor extends CollectionTypeDescriptor {
    public int rows;
    public int columns;

    public MatrixTypeDescriptor() {
        super(TypeDescriptorKind.matrix);
        assignableTypes = new TypeDescriptorKind[] {TypeDescriptorKind.matrix};

    }

    @Override
    public boolean canCalculate(TypeDescriptor type, String operator) {
        if(type.kind == TypeDescriptorKind.number) {
            return operator.equals("*");                                                            // Must be a valid operation
        } else if(type.kind == TypeDescriptorKind.matrix) {
            if(operator.equals("*")) {                                                              // Matrix multiplication
                return columns == ((MatrixTypeDescriptor)type).rows;                                // Number of columns in matrix 1 must match number of rows in matrix 2
            } else if(operator.equals("+") || operator.equals("-")) {                               // Matrix addition or subraction
                return columns == ((MatrixTypeDescriptor)type).columns &&                           // Number of columns in matrix 1 must match the number of columns in matrix 2
                        rows == ((MatrixTypeDescriptor)type).rows;                                  // Number of rows in matrix 1 must match the number of rows in matrix 2
            }
        } else if(type.kind == TypeDescriptorKind.vector) {
            return columns == ((VectorTypeDescriptor)type).length &&                                // Number of matrix-columns must match the vector-length
                    operator.equals("*");                                                           // Must be a valid operation
        }
        return false;
    }

    @Override
    public TypeDescriptor getResultType(TypeDescriptor type, String operator) {
        if(canCalculate(type, operator)) {
            if(type.kind == TypeDescriptorKind.number) {
                return this;
            } else if(type.kind == TypeDescriptorKind.matrix) {
                if(operator.equals("*")) {
                    return new MatrixTypeDescriptor(columns, ((MatrixTypeDescriptor)type).rows);
                } else if(operator.equals("+") || operator.equals("-")) {
                    return this;
                }
            } else if(type.kind == TypeDescriptorKind.vector) {
                return new VectorTypeDescriptor(rows);
            }
        }
        return null;
    }

    public MatrixTypeDescriptor(int rows, int columns) {
        this();
        this.rows = rows;
        this.columns = columns;
    }
}
