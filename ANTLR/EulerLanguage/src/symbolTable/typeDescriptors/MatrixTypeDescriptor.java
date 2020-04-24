package symbolTable.typeDescriptors;

public class MatrixTypeDescriptor extends TypeDescriptor{
    public int rows;
    public int columns;

    public MatrixTypeDescriptor() {
        compatibleTypes = new TypeDescriptorKind[] {TypeDescriptorKind.matrix};
        kind = TypeDescriptorKind.matrix;
    }

    public MatrixTypeDescriptor(int rows, int columns) {
        this();
        this.rows = rows;
        this.columns = columns;
    }
}
