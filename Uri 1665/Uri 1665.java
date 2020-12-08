//@Author Diego Lins

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int X, cont;
		for (int i = 0; i < N; i++) {
			cont = 0;
			X = in.nextInt();
			for (int j = 2; j < X; j++) {
				if (X % j == 0)
					cont++;
			}
			if (cont == 0)
				System.out.println(X + " eh primo");
			else
				System.out.println(X + " nao eh primo");
		}
		in.close();
	}

    }