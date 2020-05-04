package visitors.CodeGen;

public class CodeGenStringBuilder{

    private StringBuilder codeGenString = new StringBuilder();
    private int scopeIndentation = 0;

    public void IncreaseIndent(){
        scopeIndentation++;
    }

    public void DecreaseIndent(){
        scopeIndentation--;
    }
    
    public void AppendHeader(){
        AppendDirectives();
        AppendSpace();
        AppendStructures();
        AppendSpace();
        AppendPrototypes();
        AppendSpace();
	}

    private void AppendDirectives(){
        AppendComment("Include directives:");
        AppendSpace();
        AppendText("#include <stdio.h>");
        AppendText("#include <stdlib.h>");
    }

    private void AppendStructures(){
        AppendComment("Struct Declarations");
        AppendSpace();

        AppendText("typedef struct vector {");
        scopeIndentation++;
        AppendText("double *elements;");
        AppendText("int length;");
        scopeIndentation--;
        AppendText("} Vector;");
        AppendSpace();

        AppendText("typedef struct matrix {");
        scopeIndentation++;
        AppendText("double** elements;");
        AppendText("int rows;");
        AppendText("int columns;");
        scopeIndentation--;
        AppendText("} Matrix;");
	}

    private void AppendPrototypes(){
        AppendComment("Prototype Declarations:");
        AppendSpace();
        AppendText("Matrix CreateMatrix(const int rows, const int columns);");
        AppendText("Vector CreateVector(const int length);");
        AppendText("void FreeVector(Vector *vector);");
        AppendText("void FreeMatrix(Matrix *matrix);");
        AppendText("Vector MatrixVectorMultiplication(Matrix matrix, Vector vector);");
        AppendText("Vector VectorAddition(Vector vectorA, Vector vectorB);");
        AppendText("Matrix MatrixMatrixMultiplication(Matrix matrix, Matrix matrix2);");
        AppendText("Matrix MatrixAddition(Matrix matrixA, Matrix matrixB);");
        AppendText("double DotProduct(Vector vector, Vector vector2);");
        AppendText("Vector VectorMatrixMultiplication(Vector vector, Matrix matrix);");
        AppendText("Vector CrossProduct(Vector vector, Vector vector2);");
        AppendText("Matrix MatrixScalar(Matrix matrixA, double scalar);");
        AppendText("Vector VectorScalar(Vector vector, double scalar);");
        AppendText("Vector VectorSubtraction(Vector vectorA, Vector vectorB);");
        AppendText("Matrix MatrixSubtraction(Matrix matrixA, Matrix matrixB);");
    }

    public void AppendMain(){
        AppendText("int main(int argc, char *argv[]){");
        scopeIndentation++;
        AppendText("int* num;");
    }

    public void AppendCloseMain(){
        AskForInputBeforeClosing();
        AppendSpace();
        AppendText("return EXIT_SUCCESS;");
        scopeIndentation--;
        AppendText("}");
    }

    private void AskForInputBeforeClosing(){
        AppendSpace();
        AppendText("printf(\"\\n\");");
        AppendText("scanf(\"%s\");");
    }

    public void AppendText(String text){
        for(int index = 0; index < scopeIndentation; index++){
            codeGenString.append("\t");
        }
        codeGenString.append(text);
        codeGenString.append("\n");
    }

    public void AppendComment(String text){
        for(int index = 0; index < scopeIndentation; index++){
            codeGenString.append("\t");
        }
        codeGenString.append("/* ");
        codeGenString.append(text);
        codeGenString.append(" */\n");
    }
    
    public void AppendSpace(){
        codeGenString.append("\n");
    }

    public String ReturnString(){
        return codeGenString.toString();
    }

    public void AppendFunctions(){
        AppendCreateMatrix();
        AppendSpace();

        AppendCreateVector();
        AppendSpace();

        AppendFreeVector();
        AppendSpace();

        AppendFreeMatrix();
        AppendSpace();

        AppendMatrixVectorMultiplication();
        AppendSpace();
        
        AppendVectorAddition();
        AppendSpace();

        AppendMatrixMatrixMultiplication();
        AppendSpace();

        AppendMatrixAddition();
        AppendSpace();

        AppendDotProduct();
        AppendSpace();

        AppendCrossProduct();
        AppendSpace();

        AppendVectorMatrixMultiplication();
        AppendSpace();

        AppendVectorScalar();
        AppendSpace();

        AppendMatrixScalar();
        AppendSpace();

        AppendVectorSubtraction();
        AppendSpace();

        AppendMatrixSubtraction();

	}
    
    private void AppendCreateMatrix(){
        AppendText("Matrix CreateMatrix(const int rows, const int columns) {");
        scopeIndentation++;
        AppendText("int i;");
        AppendText("Matrix result;");
        AppendText("result.rows = rows;");
        AppendText("result.columns = columns;");
        AppendText("result.elements = (double**) calloc(rows ,sizeof(double*));");
        AppendSpace();
        AppendText("for(i = 0; i < rows; i++){");
        scopeIndentation++;
        AppendText("result.elements[i] = calloc(columns ,sizeof(double));");
        scopeIndentation--;
        AppendText("}");
        AppendSpace();
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
    }

    private void AppendCreateVector(){
        AppendText("Vector CreateVector(const int length){");
        scopeIndentation++;
        AppendText("Vector result;");
        AppendText("result.length = length;");
        AppendText("result.elements = (double*) calloc(length ,sizeof(double));");
        AppendSpace();
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
	}

    private void AppendFreeVector(){
        AppendText("void FreeVector(Vector *vector){");
        scopeIndentation++;
        AppendText("free((*vector).elements);");
        scopeIndentation--;
        AppendText("}");
	}

    private void AppendFreeMatrix(){
        AppendText("void FreeMatrix(Matrix *matrix){");
        scopeIndentation++;
        AppendText("int i;");
        AppendText("for(i = 0; i < (*matrix).rows; i++){");
        scopeIndentation++;
        AppendText("free((*matrix).elements[i]);");
        scopeIndentation--;
        AppendText("}");
        AppendSpace();
        AppendText("free((*matrix).elements);");
        scopeIndentation--;
        AppendText("}");
    }

    private void AppendMatrixVectorMultiplication(){
        AppendText("Vector MatrixVectorMultiplication(Matrix matrix, Vector vector){");
        scopeIndentation++;
        AppendText("int i, j;");
        AppendText("Vector result = CreateVector(matrix.rows);");
        AppendSpace();
        AppendText("for(i = 0; i < matrix.rows; i++){");
        scopeIndentation++;
        AppendText("for(j = 0; j < matrix.columns; j++){");
        scopeIndentation++;
        AppendText("result.elements[i] +=matrix.elements[i][j] *vector.elements[j];");
        scopeIndentation--;
        AppendText("}");
        scopeIndentation--;
        AppendText("}");
        AppendSpace();
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
    }
    
    private void AppendVectorAddition(){
        AppendText("Vector VectorAddition(Vector vectorA, Vector vectorB){");
        scopeIndentation++;
        AppendText("int i;");
        AppendText("Vector result = CreateVector(vectorA.length);");
        AppendSpace();
        AppendText("for(i = 0; i < vectorA.length; i++){");
        scopeIndentation++;
        AppendText("result.elements[i] = vectorA.elements[i] +vectorB.elements[i];");
        scopeIndentation--;
        AppendText("}");
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
    }

    private void AppendMatrixMatrixMultiplication(){
        AppendText("Matrix MatrixMatrixMultiplication(Matrix matrix, Matrix matrix2){");
        scopeIndentation++;
        AppendText("int i, j, h;");
        AppendText("double temp;");
        AppendText("Matrix result = CreateMatrix(matrix.rows, matrix2.columns);");
        AppendText("for (i = 0; i < matrix.rows; i++) {");
        scopeIndentation++;
        AppendText("for (j = 0; j < matrix2.columns; j++) {");
        scopeIndentation++;
        AppendText("for (h = 0; h < matrix2.rows; h++) {");
        scopeIndentation++;
        AppendText("temp = temp + matrix.elements[i][h]*matrix2.elements[h][j];");
        scopeIndentation--;
        AppendText("}");
        AppendText("result.elements[i][j] = temp;");
        AppendText("temp = 0;");
        scopeIndentation--;
        AppendText("}");
        scopeIndentation--;
        AppendText("}");
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
    }

    private void AppendMatrixAddition(){
        AppendText("Matrix MatrixAddition(Matrix matrixA, Matrix matrixB){");
        scopeIndentation++;
        AppendText("int i, j;");
        AppendText("Matrix result = CreateMatrix(matrixA.rows, matrixB.columns);");
        AppendText("for(i = 0; i < matrixA.rows; i++){");
        scopeIndentation++;
        AppendText("for(j = 0; j < matrixA.columns; j++)");
        AppendText("result.elements[i][j] = matrixA.elements[i][j] + matrixB.elements[i][j];");
        scopeIndentation--;
        AppendText("}");
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
    }

    private void AppendCrossProduct(){
        AppendText("Vector CrossProduct(Vector vector, Vector vector2){");
        scopeIndentation++;
        AppendText("Vector result = CreateVector(vector.length);");
        AppendText("result.elements[0] = vector.elements[2] * vector2.elements[3] - vector2.elements[2] * vector.elements[3];");
        AppendText("result.elements[1] = vector2.elements[1] * vector.elements[3] - vector.elements[1] * vector2.elements[3];");
        AppendText("result.elements[2] = vector.elements[1] * vector2.elements[2] - vector2.elements[1] * vector.elements[2];");
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
    }

    private void AppendDotProduct(){
        AppendText("double DotProduct(Vector vector, Vector vector2){");
        scopeIndentation++;
        AppendText("int i;");
        AppendText("double result = 0.0;");
        AppendSpace();
        AppendText("for (i = 0; i < vector.length; i++){");
        scopeIndentation++;
        AppendText("result += vector.elements[i]*vector2.elements[i];");
        scopeIndentation--;
        AppendText("}");
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
    }

    private void AppendVectorMatrixMultiplication(){
        AppendText("Vector VectorMatrixMultiplication(Vector vector, Matrix matrix){");
        scopeIndentation++;
        AppendText("int i, j;");
        AppendText("Vector result = CreateVector(matrix.columns);");
        AppendSpace();
        AppendText("for(i = 0; i < matrix.rows; i++){");
        scopeIndentation++;
        AppendText("for(j = 0; j < matrix.columns; j++){");
        scopeIndentation++;
        AppendText("result.elements[i] += matrix.elements[j][i] *vector.elements[j];");
        scopeIndentation--;
        AppendText("}");
        scopeIndentation--;
        AppendText("}");
        AppendSpace();
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
    }

    private void AppendVectorScalar(){
        AppendText("Vector VectorScalar(Vector vector, double scalar){");
        scopeIndentation++;
        AppendText("int i;");
        AppendText("Vector result = CreateVector(vector.length);");
        AppendText("for(i = 0; i < vector.length; i++){");
        scopeIndentation++;
        AppendText("result.elements[i] = vector.elements[i] * scalar;");
        scopeIndentation--;
        AppendText("}");
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
    }

    private void AppendMatrixScalar(){
        AppendText("Matrix MatrixScalar(Matrix matrixA, double scalar){");
        scopeIndentation++;
        AppendText("int i, j;");
        AppendText("Matrix result = CreateMatrix(matrixA.rows, matrixA.columns);");
        AppendText("for(i = 0; i < matrixA.rows; i++){");
        scopeIndentation++;
        AppendText("for(j = 0; j < matrixA.columns; j++)");
        scopeIndentation++;
        AppendText("result.elements[i][j] = matrixA.elements[i][j] * scalar;");
        scopeIndentation--;
        scopeIndentation--;
        AppendText("}");
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
    }

    private void AppendMatrixSubtraction(){
        AppendText("Matrix MatrixSubtraction(Matrix matrixA, Matrix matrixB){");
        scopeIndentation++;
        AppendText("int i, j;");
        AppendText("Matrix result = CreateMatrix(matrixA.rows, matrixB.columns);");
        AppendText("for(i = 0; i < matrixA.rows; i++){");
        scopeIndentation++;
        AppendText("for(j = 0; j < matrixA.columns; j++)");
        AppendText("result.elements[i][j] = matrixA.elements[i][j] - matrixB.elements[i][j];");
        scopeIndentation--;
        AppendText("}");
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
    }

    private void AppendVectorSubtraction(){
        AppendText("Vector VectorSubtraction(Vector vectorA, Vector vectorB){");
        scopeIndentation++;
        AppendText("int i;");
        AppendText("Vector result = CreateVector(vectorA.length);");
        AppendSpace();
        AppendText("for(i = 0; i < vectorA.length; i++){");
        scopeIndentation++;
        AppendText("result.elements[i] = vectorA.elements[i] - vectorB.elements[i];");
        scopeIndentation--;
        AppendText("}");
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
    }
}