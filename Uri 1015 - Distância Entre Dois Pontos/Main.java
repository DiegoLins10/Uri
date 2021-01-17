import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		double x1, x2, y1, y2, distancia, soma;
		
		Scanner in = new Scanner(System.in);
		x1 = in.nextDouble();
		y1 = in.nextDouble();
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		soma = (Math.pow((x2 - x1),2)) + (Math.pow((y2 - y1),2));
		distancia = Math.sqrt(soma);
		System.out.printf("%.4f%n", distancia);
		
	}

}   