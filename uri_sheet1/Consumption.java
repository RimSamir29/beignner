package beignner;
import java.util.*;
public class Consumption {

	public static void main (String [] args) {
		
		int X;
		double Y;
		
		Scanner input = new Scanner (System.in);
		
		X = input.nextInt();
		Y = input.nextDouble();
		
		Double Cons = X / Y;
		System.out.printf("%.3f Km/l%n", Cons );
		
	}
}
