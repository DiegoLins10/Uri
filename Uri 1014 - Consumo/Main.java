import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int X;
		double Y; 
		Scanner in =new Scanner(System.in);
		X = in.nextInt();
		Y = in.nextDouble();
		double consumo = X / Y; 
		System.out.printf("%.3f km/l%n", consumo);
	  	
	}
}