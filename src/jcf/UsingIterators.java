package jcf;

import java.util.*;

public class UsingIterators {

	public static void main(String[] args) { 
		
		LinkedList<Integer> lst = new LinkedList<Integer>();
		for (int i=100; i<110; i++) {
	    	lst.add(i);
		}
		
		Iterator<Integer> iter = lst.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();


        // Iterators may provide a remove() method.
        // This is the only legal modification of a collection
        // while iterating through it.  Can't add - potential
        // unspecified behavior.
        iter = lst.iterator();  // restart the iterator
        while (iter.hasNext()) {
            Integer temp = iter.next();
            if((temp % 2) == 1) {
                iter.remove();
            }
        }

        System.out.println(lst);
        System.out.println("Remaining Size: " + lst.size());
		System.out.println();


		int counter = 0;
		for(Iterator<Integer> it = lst.iterator(); it.hasNext(); ) {
			System.out.print(it.next() + " ");
			counter++;
		}
		System.out.println("\n");

		// foreach loop is using an iterator under the hood
        System.out.println("For loop using iterator under the hood");
        counter = 0;
		for(Integer k : lst) {
			System.out.print(k + " ");
			counter ++;
		}
	}
}