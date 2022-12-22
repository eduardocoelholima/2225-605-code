package io.io2;

import java.io.*;
import java.util.*;

public class Self_Reader {
  public static void main( String args[] ) {

    Hashtable aHashTable;

    try {
        FileInputStream istream =
		      new FileInputStream("self.ser");
        ObjectInputStream p = new ObjectInputStream(istream);

        aHashTable= (Hashtable)p.readObject();
        System.out.println("plus  Movie = " + aHashTable.get("plus  Movie"));
        System.out.println("The HashTable" + aHashTable.get("The HashTable"));
	System.out.println("aHashTable = " + aHashTable.toString());
        p.close();
    }
    catch ( IOException e)	{
    	System.out.println(e.getMessage());
    }
    catch ( ClassNotFoundException e)	{
    	System.out.println(e.getMessage());
    }
  }
}
