package io.io2;

import java.io.*;
import java.util.*;

public class ObjectReader_2 {
  public static void main( String args[] ) {

    Hashtable aHashTable;

    try (
        FileInputStream istream = new FileInputStream("object_2.ser");
        ObjectInputStream p = new ObjectInputStream(istream);
	) {
        aHashTable= (Hashtable)p.readObject();
	  System.out.println("aHashTable = " + aHashTable.toString());
    }
    catch ( IOException e)	{
    	System.out.println(e.getMessage());
    }
    catch ( ClassNotFoundException e)	{
    	System.out.println(e.getMessage());
    }
  }
}
