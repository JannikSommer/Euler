#include <stdlib.h>
#include <stdio.h>

typedef struct vector {
	double *elements;
	int length;
} Vector;

typedef struct matrix {
	double **elements;
	int rows;
	int columns;
} Matrix;

Matrix CreateMatrix(const int rows, const int columns);
Vector CreateVector(const int length);
void FreeVector(Vector *vector);
void FreeMatrix(Matrix *matrix);
Vector MatrixVectorMultiplication(Matrix matrix, Vector vector);
Vector VectorAddition(Vector vectorA, Vector vectorB);

int main() {
	// Initialization
	int i;
	Matrix A, B;
	Vector x, u, Ax, Bu;
	
	A = CreateMatrix(2, 2);
	A.elements[0][0] = 0.95; A.elements[0][1] = 0.00;
	A.elements[1][0] = 0.00; A.elements[1][1] = 1.00;
	
	B = CreateMatrix(2, 1);
	B.elements[0][0] = 1.10; B.elements[1][0] = 5.00;
	
	x = CreateVector(2);
	x.elements[0] = 12.00; x.elements[1] = 0.00;
	
	u = CreateVector(1);
	u.elements[0] = 0.00;
	
	Ax = MatrixVectorMultiplication(A, x);
	Bu = MatrixVectorMultiplication(B, u);
	
	// Controller
	for(i = 0; i < 50; i++) {
		if(x.elements[0] < 20.00) 
			u.elements[0] = 1.00;
		else
			u.elements[0] = 0.00;
			
		// Calculate Next State
		
		FreeVector(&Ax); FreeVector(&Bu);
		Ax = MatrixVectorMultiplication(A, x);
		Bu = MatrixVectorMultiplication(B, u);
		FreeVector(&x);
		x = VectorAddition(Ax, Bu);
		
		printf("%2d: Temperature = %2.2f   Cost = %3.2f\n", i, x.elements[0], x.elements[1]);
	}

	return EXIT_SUCCESS;
}

Matrix CreateMatrix(const int rows, const int columns) {
	int i;
	Matrix result;
	result.rows = rows;
	result.columns = columns;
	result.elements = (double**) calloc(rows, sizeof(double*));
	
	for(i = 0; i < rows; i++) {
		result.elements[i] = calloc(columns, sizeof(double));
	}
	
	return result;
}

Vector CreateVector(const int length) {
	Vector result;
	result.length = length;
	result.elements = (double*) calloc(length, sizeof(double));
	
	return result;
}

void FreeVector(Vector *vector) {
	free((*vector).elements);
}

void FreeMatrix(Matrix *matrix) {
	int i;
	for(i = 0; i < (*matrix).rows; i++) {
		free((*matrix).elements[i]);
	}

	free((*matrix).elements);
}

Vector MatrixVectorMultiplication(Matrix matrix, Vector vector) {
	int i, j;
	Vector result = CreateVector(matrix.rows);
	
	for(i = 0; i < matrix.rows; i++) {
		for(j = 0; j < matrix.columns; j++) {
			result.elements[i] += matrix.elements[i][j] * vector.elements[j];
		}
	}
	
	return result;
}

Vector VectorAddition(Vector vectorA, Vector vectorB) {
	int i;
	Vector result = CreateVector(vectorA.length);
	
	for(i = 0; i < vectorA.length; i++) {
		result.elements[i] = vectorA.elements[i] + vectorB.elements[i];
	}
	return result;
}

