package lambda;

/**
 * Technique to use when the top-level code for a new Thread is small
 *
 * @author James Heliotis
 */
public class LambdaThread {

    public static void main( String[] args ) {

        new Thread( () -> kPrint( 0 ) ).start();

        new Thread( () -> kPrint( 'X' ) ).start();

        new Thread( () -> kPrint( true ) ).start();

    }

    private static < T > void kPrint( T a ) {
        for ( int i = 0; i < 1000; ++i ) {
            System.out.print( " " + a );
        }
    }
}
