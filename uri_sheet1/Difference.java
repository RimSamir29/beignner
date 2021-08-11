package beignner;
import java.util.Scanner;

public class Difference {

	public static void main(String[]args) {
		int A,B,C,D;
		Scanner input = new Scanner (System.in);
		
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();
		
		int DIFERENCA = ((A*B)- (C*D));
		
		System.out.printf("DIFERENCA = %d%n", DIFERENCA);
	}
}
