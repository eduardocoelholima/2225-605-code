package io;


import java.io.*;

public class DataStreams {
    public static void main(String args[]) {
//        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("input2.txt"));
//             DataInputStream in = new DataInputStream(new FileInputStream("input2.txt"));) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("input2.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("input2.txt"))); ) {
            //writing into input2.txt
            out.writeChars("example of data streams");
            out.writeInt(14);
            out.writeDouble(1578.52);
            out.writeBoolean(false);
            out.flush();
            //reading from input2.txt
//            System.out.println(in.readChar());
//            System.out.println(in.readInt());
//            System.out.println(in.readDouble());
//            System.out.println(in.readBoolean());

            for (int i=0; i<"example of data streams".length(); i++)
                System.out.print(in.readBoolean());
            System.out.println();
            System.out.println(in.readInt());
            System.out.println(in.readDouble());
            System.out.println(in.readBoolean());


        } catch (IOException ef) {
            // System.out.println("File not found");
            System.out.println(ef.getMessage());
        } }
}
