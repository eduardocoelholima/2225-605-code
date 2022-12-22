package io.io2;

import java.io.*;
import java.util.*;

public class StringObjectRead {

  public static void main( String args[] ) {

    StringObject aStringObject;
    String fileName = "1234.ser";

    if ( args.length == 1 )
	fileName = args[0];
    try (
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName) );
	) {
        aStringObject = (StringObject)inputStream.readObject();
	System.out.println("aStringObject = " + aStringObject );
    }
    catch ( IOException e)	{
    	System.out.println(e.getMessage());
	e.printStackTrace();
    }
    catch ( ClassNotFoundException e)	{
    	System.out.println(e.getMessage());
	e.printStackTrace();
    }
  }
}
