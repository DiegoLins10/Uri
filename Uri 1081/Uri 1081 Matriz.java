import java.io.IOException;  //Matriz com java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{

		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		double soma = 0;
		char T = in.next().toUpperCase().charAt(0);
		double[][] M = new double[3][3];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = in.nextDouble();
			}
		}

		for (int j = 0; j < M.length; j++) {
			soma += M[L][j]; // L = Coluna  J = linha//
		}

		if (T == 'M')
			soma /= M.length;
		System.out.println(String.format("%.1f", soma));
		
		in.close();
	}

}
