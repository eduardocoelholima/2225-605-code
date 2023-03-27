package io;

import java.util.Scanner;
import java.io.*;

public class NLetterWords {

    public static void main( String[] args ) {

        if ( args.length != 3 ) {
            System.err.println(
                    "Usage: java NLetterWords N [input-file or -] " +
                    "[output-file or -]"
            );
            System.exit( 0 );
        }
        try {
            int n = Integer.valueOf( args[ 0 ] );

            Scanner in = null;
            if ( args[ 1 ].equals( "-" ) ) {
                in = new Scanner( System.in );
            }
            else {
                in = new Scanner( new File( args[ 1 ] ) );
            }

            PrintWriter out = null;
            if ( args[ 2 ].equals( "-" ) ) {
                out = new PrintWriter( System.out , true);
            }
            else {
                out = new PrintWriter( new File( args[ 2 ] ) );
            }

            while ( in.hasNext() ) {
                String word = in.next();
                if ( word.length() == n ) {
                    out.println(word); // this will need to be flushed
                }
                out.flush();

            }

            in.close();
            out.close();
        }
        catch( IOException e ) {
            System.out.println( e );
        }
    }
}
