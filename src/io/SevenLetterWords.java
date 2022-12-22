package io;

import java.util.Scanner;
import java.io.*;

public class SevenLetterWords {

    public static void main( String[] args ) {

        try {
            Scanner in = new Scanner( new File( "words.txt" ) );
            PrintWriter out = new PrintWriter( new File( "sevens.txt" ) );

            while ( in.hasNext() ) {
                String word = in.next();
                if ( word.length() == 7 )
                    out.println( word );
            }
            
            // this is problematic - what happens if opening words.txt
            // succeeds but opening sevens.txt fails?  
            // 
            // you should use try-with-resources instead:
            //
            // try
            //     (Scanner in = new Scanner( new File( "words.txt" ));
            //     PrintWriter out = new PrintWriter( new File( "sevens.txt" ))) {
            // ...
            // }
            
            in.close();
            out.close();
        }
        catch( IOException e ) {
            System.out.println( e );
        }
    }
}
