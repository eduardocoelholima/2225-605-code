package jcf;

import java.util.*;

class BadHash { 
	private Integer age;
	private String name;
	
	public BadHash(String name, int age) { 
		this.name = name;
		this.age = age;
	}
	
	public int hashCode() { 
		return 1;
	}
}

class GoodHash { 
	private Integer age;
	private String name;
	
	public GoodHash(String name, int age) { 
		this.name = name;
		this.age = age;
	}
	
	public int hashCode() { 
		return age.hashCode();
	}
}

public class UsingMaps {

	public static void main(String [] args) {

        test1();

        test2();

	}

    public static void test1() {

        String [] data = {"it", "was", "the", "best", "of", "times",
                "it", "was", "the", "worst", "of", "times"};

        Map<String, Integer> map = new TreeMap<String, Integer>();

        Integer k;
        for(String s : data) {
            
            k = map.get(s);
            if(k != null)
                map.put(s, k+1);
            else
                map.put(s, 1);
        }

        for(String s : map.keySet()) {
            System.out.println("Key: " + s + ", Value: " + map.get(s));
        }

        System.out.println(map);

        System.out.println();

    }

    public static void test2() {

        int datasize = 40000;
        Map<BadHash, Integer> bad = new HashMap<BadHash, Integer>();
        Map<GoodHash, Integer> good = new HashMap<GoodHash, Integer>();

        System.out.println("Who's faster at put?");
        long startTime = System.nanoTime();
        for(int i = 0; i < datasize; i++) {
            bad.put(new BadHash("Hello", i),  i);
        }
        long endTime = System.nanoTime();
        System.out.println("With BadHash took: " + (endTime-startTime) /
                1000000000.0 + " seconds");

        startTime = System.nanoTime();
        for(int i = 0; i < datasize; i++) {
            good.put(new GoodHash("Goodbye", i), i);
        }
        endTime = System.nanoTime();
        System.out.println("With GoodHash took: " + (endTime-startTime) /
                1000000000.0 + " seconds");


    }
}
