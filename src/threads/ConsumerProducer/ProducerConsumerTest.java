package threads.consumerProducer;

/**
 * The main program creates all the objects and starts the
 * producer and consumer threads.
 *
 * @author Sun Microsystems
 */
public class ProducerConsumerTest {
    public static void main( String[] args ) {
        SafeBox c = new SafeBox();

        // Create two producers and start them
        for ( int i = 0; i < 2; i++ ) {
            Producer p1 = new Producer( c, i );
            p1.start();
        }

        // Create two consumers and start them
        for ( int i = 0; i < 2; i++ ) {
            Consumer c1 = new Consumer( c, i );
            c1.start();
        }
    }
}
