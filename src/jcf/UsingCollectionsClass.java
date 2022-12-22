package jcf;

import java.util.*;


public class UsingCollectionsClass {

	public static void main(String[] args) {
		
		// some data types already have comparability (Integer, Double, String)
		int[] data = {1, 6, 13, 4, 9, 6, 2, 6, 12};

		List<Integer> alist = new ArrayList<Integer>();
		for(int x: data) { 
			alist.add(x);
		}

        // Collections class has some methods that require a List object
		// that has an ordering
		System.out.println("Original ArrayList: " + alist);
		Collections.sort(alist);
		System.out.println("Sorted ArrayList: " + alist);
		Collections.shuffle(alist);
		System.out.println("Shuffled ArrayList: " + alist);
		Collections.reverse(alist);
		System.out.println("Reversed ArrayList: " + alist);
		
		
		System.out.println("Max element: " + Collections.max(alist));
		System.out.println("Min element: " + Collections.min(alist));
		System.out.println("Frequency of '6': " + Collections.frequency(alist,6));
		
		// some work with any Collection
		Collection<Integer> blist = new HashSet<Integer>(alist);
		System.out.println();
		System.out.println("Max element: " + Collections.max(blist));
		System.out.println("Min element: " + Collections.min(blist));
		System.out.println("Frequency of '6': " + Collections.frequency(blist,6));
		

	}

}




