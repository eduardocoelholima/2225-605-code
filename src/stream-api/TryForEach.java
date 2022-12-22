package streams;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Demonstrate simple use of the Stream class.
 * @author James Heliotis
 */
public class TryForEach {
    public static void main( String[] args ) {
        Collection< Integer > numbers = new ArrayList<>();

        // Fill the collection with the first few Fibonacci numbers.
        int a = 0;
        numbers.add( a );
        int b = 1;
        numbers.add( b );
        while ( b <= 13 ) {
            int old_b = b;
            b = a + b;
            numbers.add( b );
            a = old_b;
        }

        numbers.forEach( System.out::println );
        System.out.println( "\nOdd numbers only:\n" );
        numbers.stream()
                .filter( n -> n % 2 == 1 )
                .forEach( System.out::println );
    }
}
