import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i=x; i<x+12; i++){
		    if(i%2 == 1){
		        System.out.println(i);
		    }
		}
	}
}
