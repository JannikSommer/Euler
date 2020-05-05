/* Include directives: */

#include <stdio.h>
#include <stdlib.h>

/* Struct Declarations */

typedef struct vector {
	double *elements;
	int length;
} Vector;

typedef struct matrix {
	double** elements;
	int rows;
	int columns;
} Matrix;

/* Prototype Declarations: */

Matrix CreateMatrix(const int rows, const int columns);
Vector CreateVector(const int length);
void FreeVector(Vector *vector);
void FreeMatrix(Matrix *matrix);
Vector MatrixVectorMultiplication(Matrix matrix, Vector vector);
Vector VectorAddition(Vector vectorA, Vector vectorB);
Matrix MatrixMatrixMultiplication(Matrix matrix, Matrix matrix2);
Matrix MatrixAddition(Matrix matrixA, Matrix matrixB);
double DotProduct(Vector vector, Vector vector2);
Vector VectorMatrixMultiplication(Vector vector, Matrix matrix);
Vector CrossProduct(Vector vector, Vector vector2);
Matrix MatrixScalar(Matrix matrixA, double scalar);
Vector VectorScalar(Vector vector, double scalar);
Vector VectorSubtraction(Vector vectorA, Vector vectorB);
Matrix MatrixSubtraction(Matrix matrixA, Matrix matrixB);

int main(int argc, char *argv[]){
	int* num;
	double index = 0.0;
	Matrix A = CreateMatrix(2, 2);
	A.elements[0][0] = 0.95; A.elements[0][1] = 0.0; 
	A.elements[1][0] = 0.0; A.elements[1][1] = 1.0; 

	Vector x = CreateVector(2);
	x.elements[0] = 12.0; x.elements[1] = 0.0; 

	Matrix B = CreateMatrix(1, 2);
	B.elements[0][0] = 1.1; B.elements[0][1] = 5.0; 

	Vector u = CreateVector(1);
	u.elements[0] = 1.0; 

	while(index<50.0){

		if(x[0]<20.0){
			FreeVector(&u);
			u = CreateVector(1);
			u.elements[0] = 1.0; 

		}
		else if(x[0]>20.0){
			FreeVector(&u);
			u = CreateVector(1);
			u.elements[0] = 0.0; 

		}
		num = (int*)&x;
		x = VectorAddition((VectorMatrixMultiplication(x, A)), (VectorMatrixMultiplication(u, B))) ;
		FreeVector((Vector*)num);
		printf("temp: %0.2fprice: %0.2f\n", x.elements[0], x.elements[1]);

	}

	FreeVector(&x);
	FreeVector(&u);
	FreeMatrix(&A);
	FreeMatrix(&B);

	printf("\n");
	scanf("%s");

	return EXIT_SUCCESS;
}

Matrix CreateMatrix(const int rows, const int columns) {
	int i;
	Matrix result;
	result.rows = rows;
	result.columns = columns;
	result.elements = (double**) calloc(rows ,sizeof(double*));

	for(i = 0; i < rows; i++){
		result.elements[i] = calloc(columns ,sizeof(double));
	}

	return result;
}

Vector CreateVector(const int length){
	Vector result;
	result.length = length;
	result.elements = (double*) calloc(length ,sizeof(double));

	return result;
}

void FreeVector(Vector *vector){
	free((*vector).elements);
}

void FreeMatrix(Matrix *matrix){
	int i;
	for(i = 0; i < (*matrix).rows; i++){
		free((*matrix).elements[i]);
	}

	free((*matrix).elements);
}

Vector MatrixVectorMultiplication(Matrix matrix, Vector vector){
	int i, j;
	Vector result = CreateVector(matrix.rows);

	for(i = 0; i < matrix.rows; i++){
		for(j = 0; j < matrix.columns; j++){
			result.elements[i] +=matrix.elements[i][j] *vector.elements[j];
		}
	}

	return result;
}

Vector VectorAddition(Vector vectorA, Vector vectorB){
	int i;
	Vector result = CreateVector(vectorA.length);

	for(i = 0; i < vectorA.length; i++){
		result.elements[i] = vectorA.elements[i] +vectorB.elements[i];
	}
	return result;
}

Matrix MatrixMatrixMultiplication(Matrix matrix, Matrix matrix2){
	int i, j, h;
	double temp;
	Matrix result = CreateMatrix(matrix.rows, matrix2.columns);
	for (i = 0; i < matrix.rows; i++) {
		for (j = 0; j < matrix2.columns; j++) {
			for (h = 0; h < matrix2.rows; h++) {
				temp = temp + matrix.elements[i][h]*matrix2.elements[h][j];
			}
			result.elements[i][j] = temp;
			temp = 0;
		}
	}
	return result;
}

Matrix MatrixAddition(Matrix matrixA, Matrix matrixB){
	int i, j;
	Matrix result = CreateMatrix(matrixA.rows, matrixB.columns);
	for(i = 0; i < matrixA.rows; i++){
		for(j = 0; j < matrixA.columns; j++)
		result.elements[i][j] = matrixA.elements[i][j] + matrixB.elements[i][j];
	}
	return result;
}

double DotProduct(Vector vector, Vector vector2){
	int i;
	double result = 0.0;

	for (i = 0; i < vector.length; i++){
		result += vector.elements[i]*vector2.elements[i];
	}
	return result;
}

Vector CrossProduct(Vector vector, Vector vector2){
	Vector result = CreateVector(vector.length);
	result.elements[0] = vector.elements[2] * vector2.elements[3] - vector2.elements[2] * vector.elements[3];
	result.elements[1] = vector2.elements[1] * vector.elements[3] - vector.elements[1] * vector2.elements[3];
	result.elements[2] = vector.elements[1] * vector2.elements[2] - vector2.elements[1] * vector.elements[2];
	return result;
}

Vector VectorMatrixMultiplication(Vector vector, Matrix matrix){
	int i, j;
	Vector result = CreateVector(matrix.columns);

	for(i = 0; i < matrix.rows; i++){
		for(j = 0; j < matrix.columns; j++){
			result.elements[i] += matrix.elements[j][i] *vector.elements[j];
		}
	}

	return result;
}

Vector VectorScalar(Vector vector, double scalar){
	int i;
	Vector result = CreateVector(vector.length);
	for(i = 0; i < vector.length; i++){
		result.elements[i] = vector.elements[i] * scalar;
	}
	return result;
}

Matrix MatrixScalar(Matrix matrixA, double scalar){
	int i, j;
	Matrix result = CreateMatrix(matrixA.rows, matrixA.columns);
	for(i = 0; i < matrixA.rows; i++){
		for(j = 0; j < matrixA.columns; j++)
			result.elements[i][j] = matrixA.elements[i][j] * scalar;
	}
	return result;
}

Vector VectorSubtraction(Vector vectorA, Vector vectorB){
	int i;
	Vector result = CreateVector(vectorA.length);

	for(i = 0; i < vectorA.length; i++){
		result.elements[i] = vectorA.elements[i] - vectorB.elements[i];
	}
	return result;
}

Matrix MatrixSubtraction(Matrix matrixA, Matrix matrixB){
	int i, j;
	Matrix result = CreateMatrix(matrixA.rows, matrixB.columns);
	for(i = 0; i < matrixA.rows; i++){
		for(j = 0; j < matrixA.columns; j++)
		result.elements[i][j] = matrixA.elements[i][j] - matrixB.elements[i][j];
	}
	return result;
}

