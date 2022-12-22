package jcf;

import java.util.*;


public class TestEquality  implements Comparable<TestEquality> {

	private String name;
	private Integer age;
	
	public String getName() { 
		return name;
	}
	
	public TestEquality(String n, Integer a) { 
		name = n;
		age = a;
	}
	
	public String toString() { 
		return name + ":" + age;
	}

    public int compareTo(TestEquality oth) {
        if(this.age > oth.age) {
            return 1;
        }
        else if(this.age < oth.age) {
            return -1;
        }
        else {
            return this.name.compareTo(oth.name);
            //return 0;
        }
    }

    public boolean equals(Object oth) {
        if(!(oth instanceof TestEquality)) {
            return false;
        }

        TestEquality te = (TestEquality)oth;

        if((this.name.equals(te.name)) &&
                this.age == te.age) {
            return true;
        }
        else {
            return false;
        }
    }

    public int hashCode() {
        return name.hashCode() + age.hashCode();
    }

	public static void main(String[] args) {
		TestEquality uc1 = new TestEquality("Jack", 10);
		TestEquality uc2 = new TestEquality("Jill", 11);
		TestEquality uc3 = new TestEquality("Hansel", 12);
		TestEquality uc4 = new TestEquality("Gretel", 11);
		TestEquality uc5 = new TestEquality("Jill", 11);

		Collection<TestEquality> alist = new ArrayList<>();
		alist.add(uc1);
		if(!alist.contains(uc2))
			alist.add(uc2);
		if(!alist.contains(uc3))
			alist.add(uc3);
		if(!alist.contains(uc4)) 
			alist.add(uc4);
		if(!alist.contains(uc5))
			alist.add(uc5);

		System.out.println("ArrayList: " + alist);

        Collection<TestEquality> hs = new HashSet<>();
        hs.add(uc1);
        hs.add(uc2);
        hs.add(uc3);
        hs.add(uc4);
        hs.add(uc5);

        System.out.println("Hash set: " + hs);
        
        Collection<TestEquality> ts = new TreeSet<>();
        ts.add(uc1);
        ts.add(uc2);
        ts.add(uc3);
        ts.add(uc4);
        ts.add(uc5);

        System.out.println("Tree set: " + ts);

	}

}
