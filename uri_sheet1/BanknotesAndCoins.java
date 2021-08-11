package beignner;
import java.util.*;

public class BanknotesAndCoins {
	
	public static void main (String [] args) {
		
		double k;
		
		Scanner input = new Scanner (System.in);
		k = input.nextDouble();
		
		int n = (int) k;
		int N = (n * 100 ) % 100;
		
		System.out.println("NOTAS:");
		
		System.out.println( (n/100) + " nota(s) de R$ 100.00");
		n = n % 100;
		
		System.out.println( (n/50) + " nota(s) de R$ 50.00");
		n = n % 50;
		
		System.out.println( (n/20) + " nota(s) de R$ 20.00");
		n = n % 20;
		
		System.out.println( (n/10) + " nota(s) de R$ 10.00");
		n = n % 10;
		
		System.out.println( (n/5) + "  nota(s) de R$ 5.00");
		n = n % 5;
		
		System.out.println( (n/2) + "  nota(s) de R$ 2.00");
		n = n % 2;
		
		System.out.println( (n/1) + "  nota(s) de R$ 2.00");
		n = n % 1;
		
		System.out.println("MOEDAS:");
		System.out.println( n + " moeda(s) de R$ 1.00");
		
		System.out.println(N / 50 +" moeda(s) de R$ 0.50");
		N%= 50;
		
		System.out.println(N / 25 +" moeda(s) de R$ 0.25");
		N%= 25;
		
		System.out.println(N / 5 +" moeda(s) de R$ 0.05");
		N%= 50;
		
		System.out.println(N  +" moeda(s) de R$ 0.01");
		N%= 1;
		
		
		
		
		
		

	}

}
