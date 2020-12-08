//@Author DiegoLins

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int b = 2;
		int align = 0;
		int a = in.nextInt();
		String vect[] = new String[a];
		if (a == 0) {

		} else {
			if (a != 0)
				System.out.print('\n');
			for (int i = 0; i < vect.length; i++) {
				vect[i] = in.next();
				int len = vect[i].length();
				if (len > align) {
					align = len; ///// TESTA O TAMANHO DAS STRING/// A VARIAVEL MAIOR SE TORNARÁ O ALIGN
				}
			} //// COMO DAR ESPAÇO EM UMA STRING PARA ALINHAR//////////
		}
		for (int i = 0; i < a; i++) {
			System.out.printf("%" + align + "s\n", vect[i]);/// o numero vira um espaçamento na string.
		}
		in.close();
	}
}