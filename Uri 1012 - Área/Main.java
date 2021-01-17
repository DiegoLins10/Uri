import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        
        double a, b, c, terretan, areacir, trape, quadra, retan;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        terretan = (a * c)/ 2;
        areacir = 3.14159 * (Math.pow(c,2));
        trape = ((a + b) * c)/2;
        quadra = Math.pow(b,2);
        retan = (a * b) ;
        System.out.printf("TRIANGULO: %.3f%n", terretan);
        System.out.printf("CIRCULO: %.3f%n", areacir);
        System.out.printf("TRAPEZIO: %.3f%n", trape);
        System.out.printf("QUADRADO: %.3f%n", quadra);
        System.out.printf("RETANGULO: %.3f%n", retan);
        
        }           
}