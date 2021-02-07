import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		
		for (int i = 1; i < 11; i++ ){
			
	        int soma = i * A;	
			System.out.printf("%d x %d = %d%n", i, A, soma);
		}
	}

}