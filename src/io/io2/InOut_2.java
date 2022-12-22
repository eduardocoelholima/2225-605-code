package io.io2;

import java.io.*;


public class InOut_2 {
  static final int BUFSIZE = 1024;

  public static void copy( String inF , String outF, int bufSize ) {
//    DataInputStream in;
//    DataOutputStream out;
    byte[]  buffer = new byte[bufSize];
    int     n;

    
    try (
    	DataInputStream in = new DataInputStream(
    				new FileInputStream(inF) );
    	DataOutputStream out = new DataOutputStream(
    				new FileOutputStream(outF) );
    	
    	) {
		while ( (n = in.read(buffer) ) != -1 ) {
			out.write(buffer, 0, n);
		}

    }
    catch ( FileNotFoundException ef)	{
    	System.out.println(ef.getMessage() );
    }
    catch ( IOException ef)	{
    	System.out.println(ef.getMessage() );
    }
    catch ( Exception e)	{
    	System.out.println("ExceptionType occurred: " + 
    		e.getMessage() );
    }
  }


  public static void main( String args[] ) {
    int     bufSize = BUFSIZE;

    if ( args.length < 2 )	{
	System.err.println(
	     "Usage: java InOut_1 from to [size]");
	System.exit(1);
    }

    if ( args.length  == 3 )	{
	try {
		bufSize = Integer.parseInt(args[2]);
	}
	catch ( NumberFormatException e )	{
		System.out.println("Can't convert " + args[2] 
			+ " to an integer.");
	}

    }
    System.out.println("BufferSize = " + bufSize);
    copy(args[0], args[1], bufSize);
  }
}
