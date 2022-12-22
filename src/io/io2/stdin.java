package io.io2;

import java.io.*;

public class stdin {
  public static void main( String args[] ) {
    LineNumberReader input;

    if ( args.length > 1 )	{
	System.err.println(
	     "Usage: java stdin file-name");
	System.exit(1);
    }

    try {
    	String line;
//
        if ( args.length == 1 )	
		input = new LineNumberReader( new FileReader(args[0]));

//			   new DataInputStream(
//                             new FileInputStream(args[0]) ) );
	else
		input = new LineNumberReader( new InputStreamReader(System.in ) );


    	while ( ( input.read() )  != -1  ) {
    		;
    	}
    	System.out.println("# lines = " + input.getLineNumber() );
	input.close();
    }
    catch ( FileNotFoundException e)	{
    	System.out.println(e.getMessage());
    }
    catch ( IOException e)	{
    	System.out.println(e.getMessage());
    }
    catch ( Exception e)	{
    	System.out.println("ExceptionType occurred: " + 
    		e.getMessage() );
    }
  }
}
