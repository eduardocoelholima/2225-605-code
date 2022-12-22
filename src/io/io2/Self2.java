package io.io2;

import java.io.*;
import java.util.*;

public class Self2 {
  public static void main( String args[] ) {

    Hashtable aHashTable = new Hashtable();
    aHashTable.put("plus  Movie", "A little Voice");
    aHashTable.put("The HashTable", aHashTable);

    try {
        FileOutputStream ostream =
		      new FileOutputStream("self.ser");
        ObjectOutputStream p = new ObjectOutputStream(ostream);
        p.writeObject(aHashTable);
        p.flush();
        p.close();
    }
    catch ( IOException e)	{
    	System.out.println(e.getMessage());
    }
    catch ( Exception e)	{
    	System.out.println(e.getMessage());
	e.printStackTrace();
	System.exit(1);
    }
 
  }
}
