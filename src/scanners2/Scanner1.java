package classes.scanners;

import java.util.Scanner;

public class Scanner1 {
	public static void main( String[] args ) {
		Scanner sc  = new Scanner( System.in);
		System.out.printf("> ");
		while ( sc.hasNext() )	{
			String line = sc.nextLine();
			System.out.printf("-%s-%n", line );
			System.out.printf("> ");
		}
		sc.close();
	}
}


