package jcf;

import java.util.*;


public class UsingSets {

	public static void main(String[] args) {
        test1();
        test2();
	}

    public static void test1() {

        String [] data = {"it", "was", "the", "best", "of", "times",
                "it", "was", "the", "worst", "of", "times"};

        // 1) shows assigning to general interface reference
        // 2) allows us to swap implementation easily
        // 3) TreeSet provides ordered data
        // 4) LinkedHashSet remembers order of insertion
        // 5) these classes have built-in toString methods
        Set<String> treeSet = new TreeSet<>();
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        for (String s : data) {
            System.out.println("string: " + s + ", hash: " + s.hashCode());
            treeSet.add(s);
            hashSet.add(s);
            linkedHashSet.add(s);
        }

        System.out.println();

        System.out.println("treeSet: " + treeSet);
        System.out.println("hashSet: " + hashSet);
        System.out.println("linkedHashSet: " + linkedHashSet);

        System.out.println();

    }

    public static void test2() {

        // set operations - subset, union, intersection, difference

        // first set all multiples of 3 up to 50
        // second set all multiples of 4 up to 50
        // third set all multiples of 6 up to 50
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        Set<Integer> set3 = new TreeSet<>();

        for(int i = 0; i <= 50; i ++) {
            if(i % 3 == 0)
                set1.add(i);
            if(i % 4 == 0)
                set2.add(i);
            if(i % 6 == 0)
                set3.add(i);

        }

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Set3: " + set3);
        System.out.println();


        // subset
        // collection has containsAll method
        System.out.println("set1 subset of set2? " + set2.containsAll(set1));
        System.out.println("set3 subset of set1? " + set1.containsAll(set3));

        System.out.println();

        // union of 1 and 2
        // collection has an addAll method - note that this modifies the set
        set1.addAll(set2);
        System.out.println("Union of set1 and set2: " + set1);

        System.out.println();

        // intersection of (1 U 2) and 3
        // collection has retainAll method
        set1.retainAll(set3);
        System.out.println("(set1 U set2) intersect set3: " + set1);

        System.out.println();

        // difference of 2 and 3 (keep only multiples of 4 that aren't multiples of 6
        // collection has a removeAll method
        set2.removeAll(set3);
        System.out.println("set2 - set3: " + set2);
    }
}
