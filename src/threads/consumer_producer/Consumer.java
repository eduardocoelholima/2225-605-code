package threads.consumer_producer;

/**
 * The consumer consumes all integers in the SafeBox as quickly as
 * they become available
 *
 * @author Sun Microsystems
 */

public class Consumer extends Thread {
    private SafeBox cubbyhole;
    private int number;

    public Consumer( SafeBox c, int number ) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for ( int i = 0; i < 10; i++ ) {
            value = cubbyhole.get();
            System.out.println( "Consumer #" + this.number
                                + " got: " + value );
        }
    }
}
