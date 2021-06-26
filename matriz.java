import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner in =  new Scanner(System.in);
		
		double[][] matriz = new double[11][11];
		double soma = 0.0;
		double media = 0.0;
	    int a = in.nextInt();
	    in.nextLine();
		String conta = in.nextLine();

		//System.out.println(conta);
		
		 for(int linha=0 ; linha < 11 ; linha++){
                for(int coluna = 0; coluna < 11 ; coluna ++){
                    System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
                    matriz[linha][coluna]=in.nextDouble();
                }
            }
        if(conta.equalsIgnoreCase("s")) {
            for(int linha=0 ; linha < 11 ; linha++){
                //System.out.printf("elemento M[%d][%d]: ",linha+1, a);
                //matriz[linha][a]=in.nextInt();
                soma += matriz[linha][a];
            }
            System.out.printf("%.1f", soma);
        }else{
            for(int linha=0 ; linha < 11 ; linha++){
                //System.out.printf("elemento M[%d][%d]: ",linha+1, a);
                //matriz[linha][a]=in.nextInt();
                soma += matriz[linha][a];
                media = soma/11;
            }
            System.out.printf("%.1f", media);
        }   
		
        
	}
}
