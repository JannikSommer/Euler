package Visitors.CodeGen;

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
    }

    public void AppendMain(){
        AppendText("int main(int argc, char *argv[]) {");
        scopeIndentation++;
    }

    public void AppendCloseMain(){
        AppendText("return EXIT_SUCCESS;");
        scopeIndentation--;
        AppendText("}");
        AppendSpace();
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
	}
    
    private void AppendCreateMatrixFunc(){
        AppendText("Matrix CreateMatrix(const int rows, const int columns) {");
        scopeIndentation++;
        AppendText("int i;");
        AppendText("Matrix  result;");
        AppendText("result.rows = rows;");
        AppendText("result.columns = columns;");
        AppendText("result.elements = (double**) calloc(rows ,sizeof(double*));");
        AppendSpace();
        AppendText("for(i = 0; i < rows; i++) {");
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
        AppendText("void FreeVector(Vector *vector) {");
        scopeIndentation++;
        AppendText("free ((*vector).elements);");
        scopeIndentation--;
        AppendText("}");
	}

    private void AppendFreeMatrix(){
        AppendText("void FreeMatrix(Matrix *matrix) {");
        scopeIndentation++;
        AppendText("int i;");
        AppendText("for(i = 0; i < (* matrix).rows; i++) {");
        scopeIndentation++;
        AppendText("free ((* matrix).elements[i]);");
        scopeIndentation--;
        AppendText("}");
        AppendSpace();
        AppendText("free ((* matrix).elements);");
        scopeIndentation--;
        AppendText("}");
    }

    private void AppendMatrixVectorMultiplication(){
        AppendText("Vector MatrixVectorMultiplication(Matrix matrix, Vectorvector) {");
        scopeIndentation++;
        AppendText("int i, j;");
        AppendText("Vector result = CreateVector(matrix.rows);");
        AppendSpace();
        AppendText("for(i = 0; i < matrix.rows; i++) {");
        scopeIndentation++;
        AppendText("for(j = 0; j < matrix.columns; j++) {");
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
        AppendText("Vector VectorAddition(Vector vectorA, Vector vectorB) {");
        scopeIndentation++;
        AppendText("int i;");
        AppendText("Vector result = CreateVector(vectorA.length);");
        AppendSpace();
        AppendText("for(i = 0; i < vectorA.length; i++) {");
        scopeIndentation++;
        AppendText("result.elements[i] = vectorA.elements[i] +vectorB.elements[i];");
        scopeIndentation--;
        AppendText("}");
        AppendText("return result;");
        scopeIndentation--;
        AppendText("}");
    }
}