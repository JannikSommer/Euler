using System;

namespace StateSpaceRepresentation
{
    class Program
    {
        static void Main(string[] args)
        {
            //T_room
            bool radiatorOn = false;
            double t_room = 12.0;
            double radiatorOnDouble = Convert.ToDouble(radiatorOn);

            //Price
            double price = 0;
            price = (5 * radiatorOnDouble) + price;

            //Initialize
            double[] aMatrix = new double[4] { 0.95, 0, 0, 1 };
            double[] xVector = new double[2] { t_room, price };
            double[] bMatrix = new double[2] { 1.1, 5 };

            double[] axresult = new double[2];
            double[] buresult = new double[2];
            double[] resultALL = new double[2];

            for (int index = 0; index < 50; index++)
            {
                //Controller
                if (resultALL[0] < 20.0)
                {
                    radiatorOn = true;
                }
                else if (resultALL[0] > 20.0)
                {
                    radiatorOn = false;
                }

                radiatorOnDouble = Convert.ToDouble(radiatorOn);

                //A*x
                axresult[0] = ((aMatrix[0] * t_room) + (aMatrix[1] * t_room));
                axresult[1] = ((aMatrix[2] * price) + (aMatrix[3] * price));

                //b*u
                buresult[0] = (bMatrix[0] * radiatorOnDouble);
                buresult[1] = (bMatrix[1] * radiatorOnDouble);

                //resultALL
                resultALL[0] = (axresult[0] + buresult[0]);
                resultALL[1] = (axresult[1] + buresult[1]);

                t_room = resultALL[0];
                price = resultALL[1];

                Console.WriteLine("The current room temperatur is: {0:0.00} and the price is {1:0.00}.  Radiator: {2}", resultALL[0], price, radiatorOn);

            }
            Console.ReadKey();
        }
    }
}
