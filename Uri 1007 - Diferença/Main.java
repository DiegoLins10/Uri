import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int  A, B, C, D, diferenca; 
		Scanner in =new Scanner(System.in);
		A= in.nextInt();
	    B= in.nextInt();
	    C= in.nextInt();
	    D = in.nextInt();
	    diferenca = (A * B)-(C * D);
	    System.out.printf("DIFERENCA = %d%n", diferenca);
	        	
	}

}