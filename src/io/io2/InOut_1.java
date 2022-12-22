package io.io2;

import java.io.*;

public class InOut_1 {
  public static void main( String args[] ) {
    byte[]  buffer = new byte[1024];
    int     n;

    if ( args.length < 2 )	{
	System.err.println(
	     "Usage: java InOut_1 from to");
	System.exit(1);
    }

    try (
    	DataInputStream in = new DataInputStream(
    				new FileInputStream(args[0]) );
    	DataOutputStream out = new DataOutputStream(
    				new FileOutputStream(args[1]) );
	) {
    	
		while ( (n = in.read(buffer) ) != -1 ) {
			out.write(buffer, 0, n);
    		}

    }
    catch ( FileNotFoundException ef)	{
    	System.out.println("File not found: " + args[1]);
    }
    catch ( IOException ef)	{
    	System.out.println("File not found: " + args[1]);
    }
    catch ( Exception e)	{
    	System.out.println("ExceptionType occurred: " + 
    		e.getMessage() );
    }

  }
}
