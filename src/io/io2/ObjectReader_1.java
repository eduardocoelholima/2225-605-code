package io.io2;

import java.io.*;
import java.util.Date;
import io.io2.ObjectWriter_1.Something;

public class ObjectReader_1 {

    public static void main( String args[] ) {

        try (
                FileInputStream istream = new FileInputStream("object_1.ser");
                ObjectInputStream p = new ObjectInputStream(istream);
        ) {
            int i = p.readInt();
            System.out.println("Integer = " + i);
            String today = (String)p.readObject();
            System.out.println("String = " + today);
            Something date = (Something)p.readObject();
            date.value = 0;
//            System.out.println("test");
            System.out.println("Date2 = " + date.value);
        }
        catch ( IOException e)	{
            System.out.println(e.getMessage());
        }
        catch ( ClassNotFoundException e)	{
            System.out.println(e.getMessage());
        }

    }
}
