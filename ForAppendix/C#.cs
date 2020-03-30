using System;

namespace Temperature {
    class Program {
        private static void Main() {
            // State-Space Representation
            double[,] A = {{0.95, 0.00},
                       {0.00, 1.00}};
            double[,] B = {{1.10},
                       {5.00}};

            double[] x = { 12.00, 0.00};
            double[] u = { 0.00 };

            // Controller
            for (int i = 0; i < 50; i++) {
                if (x[0] < 20.00) {
                    u[0] = 1.00;
                }
                else {
                    u[0] = 0.00;
                }
                x = GetNextState(x, u, A, B);
                Console.WriteLine(i + ": " + "Temperature = " + x[0] + "   Cost = " + x[1]);
            }
            
        }

        private static double[] MatrixVectorMultiply(double[,] matrix, double[] vector) {
            double[] result = new double[matrix.GetLength(0)];
            for (int i = 0; i < matrix.GetLength(0); i++) {
                for (int j = 0; j < matrix.GetLength(1); j++) {
                    result[i] += matrix[i,j] * vector[j];
                }
            }

            return result;
        }

        private static double[] VectorAddition(double[] vectorA, double[] vectorB) {
            double[] result = new double[vectorA.Length];
            for (int i = 0; i < vectorA.Length; i++) {
                result[i] = vectorA[i] + vectorB[i];
            }

            return result;
        }

        private static double[] GetNextState(double[] x, double[] u, double[,] A, double[,] B) {
            return VectorAddition(MatrixVectorMultiply(A, x), MatrixVectorMultiply(B, u));
        }

    }
}