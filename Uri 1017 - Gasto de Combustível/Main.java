import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 int tempo = in.nextInt();
		 int velocidade = in.nextInt();
		 double distancia = (tempo * velocidade);
		 double a = distancia / 12;
		 System.out.printf("%.3f%n", a);
	}
}