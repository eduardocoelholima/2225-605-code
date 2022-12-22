package io.io2;

import java.io.*;
import java.util.*;

public class StringObjectWrite {

  public static void main( String args[] ) {

    StringObject aStringObject = new StringObject("Us and Them");
    String fileName    = "1234.ser";

    if ( args.length == 1 )
        fileName = args[0];

    try (
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName) );
	) {
        outputStream.writeObject(aStringObject);
    }
    catch ( IOException e)	{
    	System.out.println(e.getMessage());
	e.printStackTrace();
    }
 
  }
}
