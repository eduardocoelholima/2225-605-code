package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Demonstrate use of the Stream class for finding any element from a stream
 * @author James Heliotis
 */
public class NumbersPlaygroundTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // getting the first element from the list
        Optional<Integer> first = numbers
                .stream()
                .filter(num -> num < 4)
                .findFirst();
        //printing that first element if present
        if (first.isPresent()) {
            System.out.println("Printing the first number from list " + numbers + " less than 4");
            System.out.println("First number less than 4 is " + first.get());
        }

        // other way of printing the first element from the list
        // using the ifPresent method
        System.out.println(".. using ifPresent method for printing the first number from list " + numbers + " less than 4");
        numbers.stream()
                .filter(num -> num < 4)
                .findFirst()
                .ifPresent(System.out::println);

        // using a parallel stream and printing any number
        // less than 4
        System.out.println("Printing any number from list " + numbers + " less than 4");
        numbers.stream()
                .parallel()
                .filter(num -> num < 4)
                .findAny()
                .ifPresent(System.out::println);

        // computing the sum of all number on the list
        // using the general-purpose reduce method
        int result = numbers.stream()
                        .reduce(0, (x, y) -> x + y);
        System.out.println("The sum of " + numbers + " is " + result);
    }
}
