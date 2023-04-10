package threads.consumer_producer;

/**
 * The producers generate unique integers and stores them in
 * a SafeBox.
 *
 * @author Sun Microsystems
 */

public class Producer extends Thread {
    private SafeBox cubbyhole;
    private int number;
    private static int value = 0;

    public Producer( SafeBox c, int number ) {
        cubbyhole = c;
        this.number = number;
    }

    public static synchronized int nextValue() {
        value += 1;
        return value;
    }

    public void run() {
        for ( int i = 0; i < 10; i++ ) {
            int value = nextValue();
            cubbyhole.put( value );
            System.out.println( "Producer #" + this.number
                                + " put: " + value );
            try {
                sleep( (int)( Math.random() * 100 ) );
            }
            catch( InterruptedException e ) { }
        }
    }
}
