import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c, MaiorAB;
		
		Scanner in =new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		MaiorAB = (a + b + Math.abs(a - b)) / 2;
		MaiorAB = (c + MaiorAB + Math.abs(MaiorAB - c)) / 2;
		System.out.printf("%d eh o maior%n", MaiorAB); 	
	}
}