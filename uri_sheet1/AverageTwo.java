package beignner;
import java.util.Scanner;

public class AverageTwo {

	public static void main (String[] args) {
		double A,B,C;
		Scanner input = new Scanner (System.in);
		
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		
		double MEDIA = ((A* 2)+(B* 3)+(C* 5)) / 10;
		
		System.out.printf("MEDIA = %.1f%n", MEDIA);
		
	}
}
