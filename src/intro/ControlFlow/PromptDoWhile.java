package intro.ControlFlow;

/**
 * An example of how the do-while statement works.
 */
public class PromptDoWhile {
    /**
     * Main method
     * @param args arguments ignored.
     */
    public static void main( String[] args ) {
        double x = -1.0;
        java.util.Scanner input = new java.util.Scanner( System.in );
        do {
            System.out.print( "Enter a positive number: " );
            if ( input.hasNextDouble() ) {
                x = input.nextDouble();
            } else {
                input.next(); // Consume the non-double input
            }
        } while ( x < 0.0 );
        System.out.println( "The square root of " + x 
                          + " is " + Math.sqrt( x ) + "." );
    }
}
