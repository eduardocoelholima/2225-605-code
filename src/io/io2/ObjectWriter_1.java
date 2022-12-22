package io.io2;


import java.io.*;
import java.util.Date;

public class ObjectWriter_1 {
    public static class Something implements Serializable {
        transient Integer value = 1;
    }

  public static void main( String args[] ) {

//    Date d = new Date();
    Something d = new Something();

    try (
        FileOutputStream ostream = new FileOutputStream("object_1.ser");
        ObjectOutputStream p = new ObjectOutputStream(ostream);
	)
        {
        p.writeInt(12345);
	  System.out.println("Integer = " + 1234);
        p.writeObject("Today");
	  System.out.println("String = " + "Today");
        p.writeObject(d);
	  System.out.println("Date = " + d);
        p.flush();
    }
    catch ( IOException e)	{
    	System.out.println(e.getMessage());
    }
 
  }
}
