import java.util.Scanner;
        
public class Main {
    
    public static void main(String[] args) {
        
        double r, esfera, pi;
        Scanner in = new Scanner(System.in);
        r = in.nextDouble();
        pi = 3.14159;
        esfera = (4.0/3.0) * pi * (Math.pow(r,3));
        System.out.printf("VOLUME = %.3f%n", esfera);

        }
        
        
            
}