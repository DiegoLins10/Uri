/*Neste problema você deve ler um número, indicando uma linha da matriz na qual uma operação deve ser
 realizada, um caractere maiúsculo, indicando a operação que será realizada, e todos os elementos de uma 
 matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média dos elementos que estão na área verde da 
 matriz, conforme for o caso. A imagem abaixo ilustra o caso da entrada do valor 2 para a linha da matriz, 
 demonstrando os elementos que deverão ser considerados na operação.

Entrada
A primeira linha de entrada contem um número L (0 ≤ L ≤ 11) indicando a linha que será considerada para 
operação. A segunda linha de entrada contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a 
operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de 
ponto flutuante que compõem a matriz, sendo que a mesma é preenchida linha por linha, da linha 0 até a 
linha 11, sempre da esquerda para a direita.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
*/

//@Author Diego F Lins
import java.io.IOException;
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
