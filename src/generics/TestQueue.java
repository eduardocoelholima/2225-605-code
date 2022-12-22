package generics;

/**
 * Test the queue by manipulating it.
 *
 * @author Sean Strout (sps@cs.rit.edu)
 * @author T.J. Borrelli (tjb@cs.rit.edu)
 */
public class TestQueue {

    public static void status(Queue<String> queue) {
        System.out.println("\nQueue status:");
        System.out.println("empty: " + queue.isEmpty());
        System.out.println("full: " + queue.isFull());
        if (!queue.isEmpty()) {
            System.out.println("front: " + queue.front());
        }
        System.out.println();
    }
    
    
    public static void main(String args[]) {

        // create a queue of strings, implemented as an array
        Queue<String> queue = new MyGenericQueue<String>();
        System.out.println("Front: " + queue.front());
        System.out.println("enqueing...");
        System.out.println("All");
        queue.enqueue("All");  

        System.out.println("Front: " + queue.front());

        System.out.println("work");
        queue.enqueue("work"); 
        System.out.println("and");
        queue.enqueue("and");
        System.out.println("no");
        queue.enqueue("no");
        System.out.println("play");
        queue.enqueue("play");
        System.out.println("makes");
        queue.enqueue("makes");
        System.out.println("Jack");
        queue.enqueue("Jack");
        System.out.println("a");
        queue.enqueue("a");
        System.out.println("dull");
        queue.enqueue("dull");
        System.out.println("boy");
        queue.enqueue("boy");

        status(queue);

        System.out.println("dequeing...");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        status(queue);

    }
}
