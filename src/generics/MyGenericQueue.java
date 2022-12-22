package generics;

import java.util.*;
/**
 * An implementation of a Queue using Java's ArrayList
 * as the underlying data structure.  Notice that 
 * the method isFull() does not apply - technically the
 * ArrayList should not become full unless I have a LOT
 * of data; since this method is included in the interface,
 * I must still provide an implementation.
 *
 * Including isFull() in the interface makes sense because
 * someone may wish to implement the queue with a bounded
 * size, or using an array.
 *
 * @author Trudy Howles tmh@cs.rit.edu
 */
public class MyGenericQueue<E> implements Queue<E> {

    private ArrayList<E> que;

    /**   
     * A constructor for my queue
     */

    public MyGenericQueue() {
        que = new ArrayList<E>();
    }


    /**
     * Return the state of the queue; return true if the
     * queue is empty, otherwise return false.
     *
     * @return true if the queue is empty, otherwise return false.
     */
    public boolean isEmpty() {
        return que.size() == 0;
    }


    /**
     * Return the first element in the queue without
     * disturbing the contents of the queue.
     *
     * @return the first element in the queue or null
     * if the queue is empty
     */
    public E front() {
        E returnVal = null;
        if (! isEmpty()) {
            returnVal = que.get(0);
        }

        return returnVal;
    }


    /**
     * Remove the first element in the queue.
     *
     * @return the first element in the queue or null
     * if the queue is empty
     */
    public E dequeue() {
        E returnVal = null;
        if ( !isEmpty()) {
            returnVal = que.remove(0);
        }
        return returnVal;
     }


    /**
     * Add an object to the end of the queue.
     *
     * @param data The data to be added to the queue.
     *
     * @return true or false indicating if the operation
     * was successful
     */
    public boolean enqueue(E data) {
        que.add (data);

        return true;
    }

    /**
     * Return the state of the queue; return true if the
     * queue is full, otherwise return false.
     *
     * @return true if the queue is full, otherwise return false.
     */
    public boolean isFull() {
        return false;
    }

}