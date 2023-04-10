package threads.consumer_producer;

/**
 * The main program creates all the objects and starts the
 * producer and consumer threads.
 *
 * @author Sun Microsystems
 */
public class ProducerConsumerTest {
    public static void main( String[] args ) {
        SafeBox safebox = new SafeBox();

        // Create two producers and start them
        for ( int i = 0; i < 2; i++ ) {
            Producer p1 = new Producer( safebox, i );
            p1.start();
        }

        // Create two consumers and start them
        for ( int i = 0; i < 2; i++ ) {
            Consumer c1 = new Consumer( safebox, i );
            c1.start();
        }
    }
}
