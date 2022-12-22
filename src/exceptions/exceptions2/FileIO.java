package exceptions.exceptions2;

import java.io.*;
public class FileIO {

  static void cp(String inF, String outF )	{
	BufferedReader in  = null;
	BufferedWriter out = null;;

	try { 
		in = new BufferedReader(
			new FileReader(inF) );
		out = new BufferedWriter(
			new FileWriter(outF) );
		int oneInt;
		while ( ( oneInt = in.read() ) >= 0 )	{
			out.write(oneInt);
		}
	}
	catch ( FileNotFoundException e )	{
		e.printStackTrace();
		System.out.println("Can't find the file!");
	}
	catch ( IOException e )	{  // Throws: IOException !!!
		e.printStackTrace();
		System.out.println("Could not be opened for writing!");
	}
	catch ( Exception e )	{
		System.out.println("Can't find the file!");
	}
	finally {
		try { 
			if ( in != null )
				in.close();
			if ( out != null )
				out.close();
		} catch ( IOException e ) {}
	}
  }

  public static void main(String args[]) {
	if ( args.length != 2 )	
		System.out.println("Usage: java FileIO f1 f2");
	else	{
		System.out.println(args[0] + "  " + args[1] );
		cp(args[0], args[1]);
	}
  }
}
