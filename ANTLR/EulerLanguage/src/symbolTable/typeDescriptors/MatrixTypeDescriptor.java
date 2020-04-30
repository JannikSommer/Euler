package symbolTable.typeDescriptors;

public class MatrixTypeDescriptor extends CollectionTypeDescriptor {
    public int rows;
    public int columns;

    public MatrixTypeDescriptor() {
        super(TypeDescriptorKind.matrix);
        compatibleTypes = new TypeDescriptorKind[] {TypeDescriptorKind.matrix};

    }

    @Override
    public boolean isCompatible(TypeDescriptor type) {
        return super.isCompatible(type) && rows == ((MatrixTypeDescriptor)type).columns && columns == ((MatrixTypeDescriptor)type).rows;
    }

    public MatrixTypeDescriptor(int rows, int columns) {
        this();
        this.rows = rows;
        this.columns = columns;
    }

    public MatrixTypeDescriptor(int rows, int columns, TypeDescriptorKind elementType) {
        this(rows, columns);
        this.elementType = elementType;
    }

}
