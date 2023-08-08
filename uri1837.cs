using System;

namespace uri
{
    class Program
    {
        static void Main(string[] args)
        {

            string entrada = Console.ReadLine();

            string[] entradas = entrada.Split();

            int a = int.Parse(entradas[0]);
            int b = int.Parse(entradas[1]);


            int q, r;
            if (a >= 0)
            {
                q = a / b;
                r = a % b;
            }
            else
            {
                int x = 0, y = 0;

                if (b < 0) x = b * -1;
                else x = b;

                for (r = 0; r < x; r++)
                {
                    y = a - r;
                    if (y % b == 0) break;
                }
                q = y / b;
            }


            Console.WriteLine($"{q} {r}");
        }
    }
}
