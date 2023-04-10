package threads.consumer_producer;

/**
 * The SafeBox has methods for storing and retrieving an integer.
 * It can only hold one integer at a time.
 *
 * @author Sun Microsystems
 */
public class SafeBox {

    /**
     * the goods in the cubby hole
     */
    private int contents;

    /**
     * whether or not there are any goods at this moment
     */
    private boolean available = false;

    /**
     * @return the goods in the cubby hole
     */
    public synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        available = false;
        notifyAll();
        return contents;
    }

    /**
     * @param value the goods to put into the cubby hole
     */
    public synchronized void put(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        contents = value;
        available = true;
        notifyAll();
    }
}
