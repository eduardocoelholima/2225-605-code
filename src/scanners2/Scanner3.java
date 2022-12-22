package classes.scanners;

import java.util.Scanner;

public class Scanner3 {
	public static void main( String[] args ) {
		Scanner sc  = new Scanner("1blobblob2blob3blob").useDelimiter("blob");
		System.out.printf("> ");
		while ( sc.hasNext() )	{
			String line = "" + sc.next();
			System.out.printf("-%s-%n", line );
			System.out.printf("> ");
		}
		sc.close();
	}
}


