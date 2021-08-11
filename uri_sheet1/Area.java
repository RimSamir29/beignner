package beignner;
import java.util.Scanner;

public class Area {
	public static void main (String [] args) {
		double A,B,C;
		
		Scanner input = new Scanner(System.in);
		
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		
		double 	TRIANGULO = (A*C) / 2;
	    double  CIRCULO = ( 3.14159) * C * C;
	    double  TRAPEZIO = ((A+B) /2) * C;
	    double  QUADRADO = B * B;
	    double  RETANGULO = A * B;
	           	
		
		
		
		
		
		System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
		System.out.printf("QUADRADO: %.3f%n", QUADRADO);
		System.out.printf("RETANGULO: %.3f%n", RETANGULO);
		
		
		
	}

}
