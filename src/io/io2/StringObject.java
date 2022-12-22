package io.io2;

import java.io.*;
import java.util.*;

public class StringObject implements Serializable {
  private String aStringObject;
  private static final long serialVersionUID = 234568L;
  // private static final long serialVersionUID = 1234568L;

  public StringObject(String aStringObject)	{
	this.aStringObject = aStringObject;
  }
  private void writeObject(ObjectOutputStream s) throws IOException {
	s.defaultWriteObject();
        s.writeObject(aStringObject.length());
  }

  private void readObject(ObjectInputStream s) throws IOException  {
	try {
         	s.defaultReadObject();
		int length = (int)s.readObject();
		System.out.println("readObject: String = " + this.aStringObject );
		System.out.println("readObject: length = " + length );
	}
        catch ( ClassNotFoundException e)	{
    	    System.out.println(e.getMessage());
    	    e.printStackTrace();
        }
  }
  public String toString()	{
	return aStringObject;
  }

}
