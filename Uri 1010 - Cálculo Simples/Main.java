import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int codigo, quant, codigo1, quant1;
		double valor, valor1, soma, soma1, total;
		Scanner in =new Scanner(System.in);
		codigo = in.nextInt();
		quant = in.nextInt();
	    valor = in.nextDouble();
	    codigo1 = in.nextInt();
	    quant1 = in.nextInt();
	    valor1 = in.nextDouble();
	    soma = quant * valor;
	    soma1 = quant1 * valor1;
	    total = soma + soma1;
	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	    
	        	
	}

}