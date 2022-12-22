package jcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class UsingComparator {

	public static void main(String[] args) {

		// Many data types require you to provide the means the comparison
		// one way to do this is by implementing the Comparable interface
		LilClass uc1 = new LilClass("Jack", 10);
		LilClass uc2 = new LilClass("Jill", 11);
		LilClass uc3 = new LilClass("Hansel", 12);
		LilClass uc4 = new LilClass("Gretel", 11);

		List<LilClass> clist = new ArrayList<LilClass>();
		clist.add(uc1);
		clist.add(uc2);
		clist.add(uc3);
		clist.add(uc4);

		System.out.println();
		System.out.println("Original ArrayList: " + clist);
		Collections.sort(clist);
		System.out.println("Sorted ArrayList: " + clist);

		// alternative sorting using Comparator
		System.out.println();
		System.out.println("Original (Sorted) ArrayList: " + clist);
		Collections.sort(clist, new NewOrdering());
		System.out.println("Sorted using Comparator: " + clist);

	}

}

class LilClass implements Comparable<LilClass>{ 
	private String name;
	private Integer age;
	
	public LilClass(String name, int age) { 
		this.name = name;
		this.age = age;
	}
	
	public String toString() { 
		return name + ":" + age;
	}
	
	public String getName() { 
		return name;
	}
	
	public Integer getAge() { 
		return age;
	}
	
	// a natural ordering for objects of this class is provided by
	// implementing the Comparable interface, and providing a
	// compareTo method
	public int compareTo(LilClass eq) { 
		if(this.age > eq.age) { 
			return 1;
		}
		else if(this.age == eq.age) { 
			return name.compareTo(eq.name);
			//return 0;
		}
		else { 
			return -1;
		}
	}
}


//this class has the sole task of implementing the Comparator
//interface for objects of LilClass and ordering them by the
//second letter of their name string, then by age

class NewOrdering implements Comparator<LilClass> {

	public int compare(LilClass obj1, LilClass obj2) { 
		if(obj1.getName().charAt(1) > obj2.getName().charAt(1)) { 
			return 1;
		}
		else if(obj1.getName().charAt(1) < obj2.getName().charAt(1)) { 
			return -1;
		}
		else
			return obj1.getAge().compareTo(obj2.getAge());
	}
}


