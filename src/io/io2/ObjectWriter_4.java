package io.io2;

import java.io.*;
import java.util.*;

public class ObjectWriter_4 implements Serializable {
  int local = 42;
  private static final long serialVersionUID = 1234568L;
  private void writeObject(ObjectOutputStream s) throws IOException {
           s.defaultWriteObject();
         // customized serialization code
  }

  private void readObject(ObjectInputStream s) throws IOException  {
	try {
         	s.defaultReadObject();
	}
        catch ( ClassNotFoundException e)	{
    	    System.out.println(e.getMessage());
    	    e.printStackTrace();
        }

         // customized deserialization code
         //  ...
         // followed by code to update the object, if necessary
  }

  public static void main( String args[] ) {

    ObjectWriter_4 aObjectWriter_4 = new ObjectWriter_4();

    try (
        FileOutputStream ostream = new FileOutputStream("object_4.ser");
        ObjectOutputStream p = new ObjectOutputStream(ostream);
	) {
        p.writeObject(aObjectWriter_4);
	  System.out.println("aObjectWriter_4 = " + aObjectWriter_4.toString());
	  System.out.println("aObjectWriter_4.local = " + aObjectWriter_4.local);
        p.flush();
    }
    catch ( IOException e)	{
    	System.out.println(e.getMessage());
	e.printStackTrace();
    }
 
  }
}
