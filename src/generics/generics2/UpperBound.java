package generics.generics2;

import java.util.*;
  
public class UpperBound { 
    public static void main(String[] args) { 
        List<Double>  listOfDoubles   = new LinkedList<Double>();
        List<Integer> listOfIntegers  = new LinkedList<Integer>();

	listOfDoubles.add( Double.valueOf(1.0) );
	listOfIntegers.add( Integer.valueOf(2) );
          
        System.out.println("sum of integer's is: " + sum(listOfIntegers)); 
        System.out.println("sum of double's is:  "  + sum(listOfDoubles)); 
    } 
  
    // instead of double?
    private static double sum(List<? extends Number> list)  { 
        double sum=0.0; 
        for (Number i: list) 
            sum += i.doubleValue(); 
        return sum; 
    } 
} 
