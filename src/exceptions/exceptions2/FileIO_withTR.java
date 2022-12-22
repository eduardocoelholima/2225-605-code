package exceptions.exceptions2;

import java.io.*;
public class FileIO_withTR {

  static void cp(String inF, String outF )	{

	try ( 
		BufferedReader in = new BufferedReader(
			new FileReader(inF) );
		BufferedWriter out = new BufferedWriter(
			new FileWriter(outF) );
	)	{
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
  }

  public static void main(String args[]) {
	if ( args.length != 2 )	
		System.out.println("Usage: java FileIO_withTR f1 f2");
	else	{
		System.out.println(args[0] + "  " + args[1] );
		cp(args[0], args[1]);
	}
  }
}
