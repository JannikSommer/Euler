package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args)  {
        // Text-formatting
        DecimalFormat df2 = new DecimalFormat("#.##");
        DecimalFormat df0 = new DecimalFormat("##");
        df2.setMinimumFractionDigits(2);
        df0.setMinimumIntegerDigits(2);

	    // Start variables
        double Temperature = 12.00;
	    double Cost = 0.00;

	    // State-Space Representation
	    double[][] A = {{0.95, 0.00},
                       {0.00 , 1.00}};
	    double[][] B = {{1.10},
                       {5.00}};

	    double[] x = {Temperature, Cost};
	    double[] u = {0.00};

	    // Controller
	    for(int i = 0; i < 50; i++) {
            if(x[0] < 20.00) {
                u[0] = 1.00;
            } else {
                u[0] = 0.00;
            }
            x = GetNextState(x, u, A, B);
            System.out.println(df0.format(i) + ": " + "Temperature = " + df2.format(x[0]) + "   Cost = " + df2.format(x[1]));
        }
    }

    static double[] MatrixVectorMultiply(double[][] matrix, double[] vector) {
        double[] result = new double[matrix.length];
        for(int i = 0; i < matrix.length; i++ ) {
            for(int j = 0; j < matrix[i].length; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }

        return result;
    }

    static double[] VectorAddition(double[] vectorA, double[] vectorB) {
        double[] result = new double[vectorA.length];
        for(int i = 0; i < vectorA.length; i++) {
            result[i] = vectorA[i] + vectorB[i];
        }

        return result;
    }

    static double[] GetNextState(double[] x, double[] u, double[][] A, double[][] B) {
        return VectorAddition(MatrixVectorMultiply(A, x), MatrixVectorMultiply(B, u));
    }
}
