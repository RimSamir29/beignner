package beignner;
import java.util.Scanner;


public class AreaOfaCircle {
	public static void main(String [] args) {

	Scanner sc = new Scanner (System.in);
	
	double A, R;
	
	R = sc.nextDouble();
	
    A = 3.14159 *R *R;
    
    System.out.printf("A=%.4f%n", A);

}
}