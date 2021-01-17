//@author Diego Lins

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
	    double raio=in.nextDouble();
	    double n = 3.14159;
	    double area = n * Math.pow(raio, 2);
	    System.out.printf("A=%.4f%n", area);	
		
	}

}