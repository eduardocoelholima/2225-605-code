package generics.generics2;

import java.util.*;

public class Unbound {

	public static void printList(List<?> list) {
		for (Object elem: list)
			System.out.print(elem + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3);
		List<String>  listOfStrings = Arrays.asList("a", "b", "c");
		printList(listOfIntegers);
		printList(listOfStrings);
	}
}

