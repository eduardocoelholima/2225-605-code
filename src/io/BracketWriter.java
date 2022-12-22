package io;

import java.io.*;

/**
 * Writes out textual data putting brackets around
 * everything that gets written.
 *
 * @author paw
 * @author zjb
 * @author jeh
 */
public class BracketWriter extends Writer {
    /**
     * The underlying (decorated) output stream
     */
    private Writer underlying;

    public BracketWriter( Writer wrappedStream ) {
        this.underlying = wrappedStream;
    }

    /**
     * Writes each character to the underlying stream
     * enclosed in brackets. Also censors the letter m.
     * This is one of the three methods left abstract in Writer.
     */
    @Override
    public void write( char[] cbuf, int off, int len ) throws IOException {
        char[] newBuff = { '[', '\0', ']' };
        for ( int i = off; i < off + len; ++i ) {
            char c = cbuf[ i ];
            newBuff[ 1 ] = ( c == 'm' ) ? '#' : c;
            this.underlying.write( newBuff, 0, 3 );
        }
    }

    /**
     * Flushes the stream.
     * This is one of the three methods left abstract in Writer.
     */
    @Override
    public void flush() throws IOException {
        this.underlying.flush();
    }

    /**
     * Closes the stream, flushing it first.
     * This is one of the three methods left abstract in Writer.
     * However, Writer's documentation states that close() must call flush().
     */
    @Override
    public void close() throws IOException {
        this.flush();
        System.out.println( "Closing the BracketWriter." );
        this.underlying.close();
    }

    public static void main( String args[] ) {

        String s = "hi mom";
        char[] buff = { 'b', 'u', 'h', '-', 'b', 'y', 'e' };

        int phase = 0; // Note how this variable had to be declared outside try.
        try (
                BracketWriter out =
                    new BracketWriter(
                        new OutputStreamWriter( System.out ) );
                        // System.out is an OutputStream, not a Writer.
            ) {
            phase = 1;
            System.out.println( "====" );
            for ( int i = 0; i < s.length(); i = i + 1 ) {
                out.write( s.charAt( i ) ); // Note we didn't override this.
            }
            out.flush();
            phase = 2;
            System.out.println( "\n====" );
            out.write( buff, 0, 3 );
            out.flush();
        }
        catch( IOException e ) {
            if ( phase == 1 ) {
                System.out.println( "string write error: " + e.getMessage() );
            }
            else {
                System.out.println( "array write error: " + e.getMessage() );
            }
        }
        // The file is closed here.
    }
}