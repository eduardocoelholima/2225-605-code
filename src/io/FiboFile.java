package io;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FiboFile {

    public static void main( String[] args ) {

        if ( args.length != 2 ) {
            System.err.println( "Usage: " +
                                "java FiboFile [input-file|\"-\"] output-file"
            );
            System.exit( 1 );
        }
        try {
            List< Long > nums = new LinkedList<>();
            if ( args[ 0 ].equals( "-" ) ) {
                // If no input file, start one with two numbers.
                nums.add( 0L );
                nums.add( 1L );
            }
            else {
                try (
                        DataInputStream dis =
                                new DataInputStream(
                                        new FileInputStream( args[ 0 ] ) );
                ) {
                    while ( true ) {
                        // Read in the old Fibonacci numbers.
                        nums.add( dis.readLong() );
                    }
                }
                catch( EOFException eofe ) {
                    // This exception was expected; no worries.
                }
            }

            // Print out the numbers read from the file.
            System.out.println( nums );

            // Create one more in the series.
            int count = nums.size();
            nums.add( nums.get( count - 2 ) + nums.get( count - 1 ) );

            // Show the revised list.
            System.out.println( nums );

            // Save the slightly longer list to the output file.
            try (
                    DataOutputStream dos =
                            new DataOutputStream(
                                    new FileOutputStream( args[ 1 ] ) );
            ) {
                for ( long num : nums ) {
                    dos.writeLong( num );
                }
            }
        }
        catch( IOException ioe ) {
            System.err.println( "Unexpected I/O error " + ioe );
        }
    }
}
