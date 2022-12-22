package classes.generics;

import java.util.*;

public class WildCard {

    public static void printCollection_2(Collection<?> c) {
        Collection obj  = c;
        for (Object e : c)
            System.out.println("2: " + e);
    }
    public static void printCollection(Collection c) {
        Iterator i = c.iterator();
        while ( i.hasNext() ) {
            System.out.println("1: "  + i.next());
        }
    }
    public static void main(String args[]) {
        String anArray[] = {"echoes", "Shine", "Tiger" } ;
        List l = Arrays.asList(anArray);
        printCollection(l);
        printCollection_2(l);
    }
}
