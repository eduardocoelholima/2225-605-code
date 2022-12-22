package generics;

/**
 * An interface for a Queue class
 *
 * @author Trudy Howles tmh@cs.rit.edu
 */
public interface Queue<E> {

    /**
     * Return the first element in the queue without
     * disturbing the contents of the queue.
     *
     * @return the first element in the queue or null
     * if the queue is empty
     */
    E front();

    /**
     * Remove the first element in the queue.
     *
     * @return the first element in the queue or null
     * if the queue is empty
     */
    E dequeue();

    /**
     * Add an object to the end of the queue.
     *
     * @param data The data to be added to the queue.
     * @return true or false indicating if the operation
     * was successful
     */
    boolean enqueue(E data);

    /**
     * Return the state of the queue; return true if the
     * queue is full, otherwise return false.
     *
     * @return true if the queue is full, otherwise return false.
     */
    boolean isFull();

    /**
     * Return the state of the queue; return true if the
     * queue is empty, otherwise return false.
     *
     * @return true if the queue is empty, otherwise return false.
     */
    boolean isEmpty();
}