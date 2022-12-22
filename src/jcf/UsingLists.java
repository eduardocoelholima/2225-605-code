package jcf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class UsingLists {

    static long startTime, endTime;
    static int dataSize = 100000;

	public static void main(String[] args) {

        Random rand = new Random();

		// ArrayList to hold a bunch of integers
		// ArrayList use an array under the hood
		// ArrayList has complexity:
		// get:  O(1)
		// add (to end):  O(1) amortized - sometimes copy to a new, larger list
		// contains:  O(N)
		// next: O(1) (iterating through list)
		// remove: O(N) to remove front element, removing last element is faster!
		List<Integer> alist = new ArrayList<>();

		// LinkedList to hold same numbers
		// LinkedList uses a linked list under the hood
		// LinkedList has complexity:
		// get: O(N)
		// add: O(1)
		// contains: O(N)
		// next: O(1) (iterating through list)
		// remove: O(1) removing from front or back - it's a doubly-linked list
		//          removing from the middle still takes O(n) to get there
		List<Integer> llist = new LinkedList<>();
		
		for(int i = 0; i < dataSize; i++) { 
			alist.add(rand.nextInt() % 1000);
			llist.add(rand.nextInt() % 1000);
		}
		
		
		// in practice, if we wanted to sequentially access the elements
		// of a list, we would iterate through them
		// (using an iterator / for loop).  We would not
		// do a sequence of independent get() calls.  This is just
		// to generate enough samples so that the total time can be
		// differentiated.

        // TEST get speed
        test1(alist, llist);

        // Test REMOVE speed:  different varieties
        // REMOVE from front
        test2(new ArrayList<>(alist), new LinkedList<>(llist), 0);
        // REMOVE from back
        test2(new ArrayList<>(alist), new LinkedList<>(llist), 1);
        // REMOVE from middle
        test2(new ArrayList<>(alist), new LinkedList<>(llist), 2);

        // Note that each of these calls is using a copy constructor
        // to create a new collection from an existing by copying
        // the elements
        // Works great to copy primitive types.  Copying objects
        // gives us copies of the references.  If we want new objects,
        // we have to create new objects.  Ultimately we'd probably
        // write a special copy() method to do the job.


	}

    public static void test1(List<Integer> alist, List<Integer> llist) {
        System.out.println("Who's faster at get?");

        startTime = System.nanoTime();
        for(int i = 0; i < dataSize; i++)
            alist.get(i);
        endTime = System.nanoTime();
        System.out.println("ArrayList took: " + (endTime-startTime) /
                1000000000.0 + " seconds");

        startTime = System.nanoTime();
        for(int i = 0; i < dataSize; i++)
            llist.get(i);
        endTime = System.nanoTime();
        System.out.println("LinkedList took: " + (endTime-startTime) /
                1000000000.0 + " seconds");

        System.out.println();

    }

    public static void test2(List<Integer> alist, List<Integer> llist,
                             int version) {

        if(version == 0) {
            System.out.println("Removing from the front!");
        }
        else if(version == 1) {
            System.out.println("Removing from the back!");
        }
        else {
            System.out.println("Removing from the middle!");
        }

        System.out.println("Who's faster at remove?");
		startTime = System.nanoTime();
        if(version == 0) { // remove from front
            for (int i = 0; i < dataSize; i++) {
                alist.remove(0);
            }
        }
        else if(version == 1) { // remove from back
            for (int i = dataSize - 1; i >= 0; i--) {
                alist.remove(i);
            }
        }
        else { // remove from middle
            for (int i = 0; i < dataSize; i++) {
                int currentSize = dataSize - i;
                alist.remove(currentSize / 2);
            }
        }
		endTime = System.nanoTime();
		System.out.println("ArrayList took: " + (endTime-startTime) /
                1000000000.0 + " seconds");

		startTime = System.nanoTime();
        if(version == 0) { // remove from front
            for (int i = 0; i < dataSize; i++) {
                llist.remove(0);
            }
        }
        else if(version == 1) { // remove from back
            for (int i = dataSize - 1; i >= 0; i--) {
                llist.remove(i);
            }
        }
        else { // remove from middle
            for (int i = 0; i < dataSize; i++) {
                int currentSize = dataSize - i;
                llist.remove(currentSize / 2);
            }
        }
		endTime = System.nanoTime();
		System.out.println("LinkedList took: " + (endTime-startTime) /
                1000000000.0 + " seconds");
        System.out.println();

    }
}
