//@Author Diego Lins

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 int A = in.nextInt();
		 int B = in.nextInt();
		 int C = in.nextInt();
		 if (B < A && C >= B) System.out.println(":)");
        else if (B > A && C <= B) System.out.println(":(");
        else if (B > A && C > B && (C - B) < (B - A)) System.out.println(":(");
        else if (B > A && C > B && (C - B) >= (B - A)) System.out.println(":)");
        else if (B < A && C < B && (B - C) < (A - B)) System.out.println(":)");
        else if (B < A && C < B && (B - C) >= (A - B)) System.out.println(":(");
        else if (B == A && C > B) System.out.println(":)");
        else if (B == A && C < B) System.out.println(":(");
        else System.out.println(":(");
		 
	}
}