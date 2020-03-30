#include <stdlib.h>
#include <stdio.h>

int main() {
	int i;
	
	// Start values
	float A[2][2] = {{0.95f, 0.0f},
					 {0.0f, 1.0f}};
	float B[2][1] = {{1.1f}, 
					 {5.0f}};
	float u[] = {0.0f};
	float x[] = {12, 0};
	
	// Temporary variables
	float Ax[] = {0, 0};
	float Bu[] = {0, 0};

	for(i = 0; i < 50; i++) {
		if(x[0] < 20.0f)
			u[0] = 1.0f;
		else
			u[0] = 0.0f;
			
		Ax[0] = A[0][0] * x[0] + A[0][1] * x[1];	
		Ax[1] = A[1][0] * x[0] + A[1][1] * x[1];
		Bu[0] = B[0][0] * u[0];	
		Bu[1] = B[1][0] * u[0];
		x[0] = Ax[0] + Bu[0]; x[1] = Ax[1] + Bu[1];
		
		printf("%2d: Temperature = %2.2f, Cost = %3.2f\n", i, x[0], x[1]);
	}

	return 0;
}
