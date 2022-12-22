package io.io2;

import java.io.*;
import java.util.*;

public class ObjectWriter_2 {
  public static void main( String args[] ) {

    Hashtable aHashTable = new Hashtable();
    aHashTable.put("plus  Movie", "A little Voice");
    aHashTable.put("minus Movie", "Independence Day");

    try (
        FileOutputStream ostream = new FileOutputStream("object_2.ser");
        ObjectOutputStream p = new ObjectOutputStream(ostream);
	) {
        p.writeObject(aHashTable);
	  System.out.println("aHashTable = " + aHashTable.toString());
        p.flush();
    }
    catch ( IOException e)	{
    	System.out.println(e.getMessage());
    }
 
  }
}
