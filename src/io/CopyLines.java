package io;/*
 * This is a basic I/O demonstration. Full lines are read from an input file
 * and written to an output file.
 * A plain FileReader is not good enough because we want to use
 * readLine from BufferedReader.
 * A plain FileWriter is not good enough because we want to use
 * println from PrintWriter. (There is now a constructor in PrintWriter that
 * accepts a file name directly.)
 */
import java.io.*;

public class CopyLines {
    public static void main( String[] args ) {
        // Note that variables referenced in catch phrases must be declared
        // outside the try/catch block.
        BufferedReader inputReader = null;
        PrintWriter outputWriter = null;

        try {
            inputReader =
                    new BufferedReader( new FileReader( "xanadu.txt" ) );
            outputWriter =
                    new PrintWriter( new FileWriter( "lineoutput.txt" ) );

            String l;
            while ( ( l = inputReader.readLine() ) != null ) {
                outputWriter.println( l );
            }
        }
        catch( FileNotFoundException fnfe ) {
            System.out.println( fnfe.getMessage() );
            System.out.println( "Please check the current directory." );
        }
        catch( IOException ioe ) {
            System.out.println( ioe.getMessage() );
        }
        finally {
            try {
                if ( inputReader != null ) inputReader.close();
            }
            catch( IOException ioe ) {
                System.out.println( ioe.getMessage() );
            }
            if ( outputWriter != null ) outputWriter.close();
        }
    }

    public static void main_short( String[] args ) {
        try (
            BufferedReader inputReader =
                    new BufferedReader( new FileReader( "xanadu.txt" ) );
            PrintWriter outputWriter =
                    new PrintWriter( new FileWriter( "lineoutput.txt" ) );
        ) {
            String l;
            while ( ( l = inputReader.readLine() ) != null ) {
                outputWriter.println( l );
            }
        }
        catch( FileNotFoundException fnfe ) {
            System.out.println( fnfe.getMessage() );
            System.out.println( "Please check the current directory." );
        }
        catch( IOException ioe ) {
            System.out.println( ioe.getMessage() );
        }
    }

}
