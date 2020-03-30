using System;

namespace StatesBased
{
    class Program
    {
        static void Main(string[] args)
        {
            double T_room = 12;
            int price = 0;

            double[,] A = new double[,] { { 0.95, 0 }, { 0, 1 } };
            double[] x = new double[] { T_room, price };
            double[,] B = new double[,] { { 1.1, 5 } };
            double[] u = new double[] { 1 };

            double[] result;

            for(int n = 0; n < 50; n++)
            {
                if(x[0] < 20)
                {
                    u[0] = 1;
                }
                else if(x[0] > 20)
                {
                    u[0] = 0;
                }

                result = CalculateStatesBased(A, x, B, u);

                x = result;

                Console.WriteLine("Room Temprature: {0:0.00}    Price: {1}", result[0], result[1]);
            }
            
        }

        static double[] CalculateStatesBased(double[,] A, double[] x, double[,] B, double[] u)
        //A*x + B*u
        {
            double[] result = new double[x.Length];
            double[] Ax = new double[x.Length];
            double[] Bu = new double[x.Length];

            //A*x
            for(int n = 0; n < A.GetLength(0); n++)
            {
                Ax[n] = 0;
                
                for(int m = 0; m < A.GetLength(1); m++)
                {
                    Ax[m] += A[n, m] * x[m];
                }
            }

            //Console.WriteLine("Ax = {0}, {1}", Ax[0], Ax[1]);

            //B*u
            for(int n = 0; n < B.GetLength(0); n++)
            {
                Bu[n] = 0;
                
                for(int m = 0; m < B.GetLength(1); m++)
                {
                    Bu[m] += B[n, m] * u[n];
                }
            }

            //Console.WriteLine("Bu = {0}, {1}", Bu[0], Bu[1]);

            //Ax + Bu
            for (int n = 0; n < x.Length; n++)
            {
                result[n] = Ax[n] + Bu[n];
            }

            //Console.WriteLine("Result = {0}, {1}", result[0], result[1]);

            return result;
        }
    }
}
