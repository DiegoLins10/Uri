import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String  nome;
		double salario, vendas;
		Scanner in =new Scanner(System.in);
		nome = in.next();
		salario = in.nextDouble();
	    vendas = in.nextDouble();
	    double comi = vendas * 0.15;
	    double sl = salario + comi;
	    System.out.printf("TOTAL = R$ %.2f%n", sl);   
	    	
	}

}