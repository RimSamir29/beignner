package beignner;
import java.util.*;
public class Banknotes {

	public static void main (String[] args) {
		
		int n;
		Scanner input = new Scanner (System.in);
		n = input.nextInt();
		
		int hundred = n / 100;
		int fifty = (n % 100) / 50;
		int twenty = ((n % 100) % 50) / 20;
		int tenth = (((n % 100) % 50) % 20) / 10;
		int fifth = ((((n % 100) % 50) % 20) %10) / 5;
		int twos = (((((n % 100) % 50) % 20) % 10) %5) / 2;
		int ones = ((((((n % 100) %50) %20) %10) %5) %2) / 1;
		
		System.out.println(n);
		System.out.println( hundred  + " nota(s) de R$ 100,00"  );
		System.out.println(fifty  + " nota(s) de R$ 50,00"  );
		System.out.println( twenty  + " nota(s) de R$ 20,00"  );
		System.out.println( tenth   + " nota(s) de R$ 10,00"  );
		System.out.println( fifth  + " nota(s) de R$ 5,00"  );
		System.out.println( twos  + " nota(s) de R$ 2,00"  );
		System.out.println(ones  + " nota(s) de R$ 1,00"  );

	}
}








