package classes.scanners;

import java.util.Scanner;
import java.io.*;

public class Scanner2 {
	public static void main( String[] args ) {
		Scanner sc  = null;
		if ( args.length > 0 )
			try {
				sc  = new Scanner(new File(args[0]) );
//				sc = new Scanner("23 23 44 444");
			} catch ( FileNotFoundException e ) {}
		else
			sc  = new Scanner( System.in);
		if ( args.length == 0 )
			System.out.printf("> ");
		while ( sc.hasNext() )	{
			Integer aInteger = sc.nextInt();
			System.out.printf("-%d-%n", aInteger );
			if ( args.length == 0 )
				System.out.printf("> ");
		}
		sc.close();
	}
}


