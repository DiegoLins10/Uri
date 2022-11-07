using System;
using System.Collections.Generic;
using System.Linq;

namespace uri1828
{
    class Program
    {
        static void Main(string[] args)
        {
            int casos = int.Parse(Console.ReadLine());

            // item/ vence
            Dictionary<string, string> list = new Dictionary<string, string>() {
                { "tesoura", "papel/lagarto" },
                { "pedra", "tesoura/lagarto" },
                { "papel", "pedra/spock" },
                { "lagarto", "papel/spock" },
                { "spock", "tesoura/pedra" },
                };

            //"pedra", "papel", "largato", "spock"
            for (int i = 1; i <= casos; i++)
            {
                // 0 sheldon
                // 1 raj
                string dados = Console.ReadLine();

                string[] escolhas = dados.ToLower().Split();

                var buscar = list.GetValueOrDefault(escolhas[0]);

                string[] fraquezas = buscar.Split('/');

                if(escolhas[0] == escolhas[1])
                {
                    Console.WriteLine($"Caso #{i}: De novo!");
                }
                else
                {
                    if(fraquezas.Where( d => d == escolhas[1]).Any())
                    {
                        Console.WriteLine($"Caso #{i}: Bazinga!");
                    }
                    else
                    {
                        Console.WriteLine($"Caso #{i}: Raj trapaceou!");
                    }
                }
            }

        }
    }
}
