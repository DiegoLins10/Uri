import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int s = 0;
		int n = in.nextInt(); // Entrada de numeros de casos
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			s = 0;
			if (a > b) {
				for (int d = b+1; d < a; d++) {
					if (d % 2 != 0) {
						s = s + d;
					}
				}
				System.out.println(s);
			}
			if (b > a) {
				for (int e = a+1; e < b; e++) {
					if (e % 2 != 0) {
						s = s + e;
					}
				}
				System.out.println(s);
			}
			if (a == b) {
				s = 0;
				System.out.println(s);
			}

		}
	}
}