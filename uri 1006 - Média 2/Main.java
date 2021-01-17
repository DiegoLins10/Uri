//@Author Diego Lins

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double  A, B, C, media; 
		Scanner in =new Scanner(System.in);
		A= in.nextDouble();
	    B= in.nextDouble();
	    C= in.nextDouble();
	    media = ((A*2)+(B*3)+(C*5))/10  ;
	    System.out.printf("MEDIA = %.1f%n", media);
	    	
	}

}