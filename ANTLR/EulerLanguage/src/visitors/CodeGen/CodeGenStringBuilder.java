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
    }

    public void AppendMain(){
        AppendText("int main(int argc, char *argv[]){");
        scopeIndentation++;
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
        AppendCreateMatrixFunc();
        AppendSpace();

        AppendCreateVectorFunc();
        AppendSpace();

        AppendFreeVector();
        AppendSpace();

        AppendFreeMatrix();
        AppendSpace();

        AppendMatrixVectorMultiplication();
        AppendSpace();
        
        AppendVectorAddition();

        AppendMatrixMatrixMultiplication();


	}
    
    private void AppendCreateMatrixFunc(){
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

    private void AppendCreateVectorFunc(){
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
}