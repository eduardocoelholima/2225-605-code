package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Example of the four types of method references
 */
public class MethodReference {

    public static void main(String[] args) {
        System.out.println("Invoking ArrayList constructor using a lambda expression");
        //using lambda expression to create instances of ArrayList
        Supplier<List<String>> supplierLambda = () -> new ArrayList<>();
        List<String> cities = supplierLambda.get();
        cities.add("Barcelona");
        cities.add("Paris");
        cities.add("New York");
        cities.add("Tokyo");
        particularType(cities, "Paris");

        System.out.println("");
        System.out.println("Invoking ArrayList constructor using a method reference");
        // using method reference to create instances of ArrayList
        Supplier<List<Integer>> supplierMR = ArrayList::new;
        List<Integer> numbers = supplierMR.get();
        numbers.add(15);
        numbers.add(35);
        numbers.add(118);
        numbers.add(1908);
        particularType(numbers, 87);

        System.out.println("");
        // testing methods references to invoke static methods
        staticMethodReference();
        System.out.println("");

        //method reference to instance method of particular object
        System.out.println("Method reference to instance method of particular object");
        cities.forEach(System.out::println);
    }

    /**
     * Example of method reference to invoke a instance method
     * of an arbitrary object of a particular type
     * @param list
     * @param value
     * @param <T>
     */
    private static <T> void particularType(List<?> list, T value ){
        System.out.println("Creating contains predicate using lambda expressions");
        //using lambda expression to verify if a list contains a value
        BiPredicate<List<?>, T> containsLambda = (l, v) -> list.contains(value);
        System.out.printf("Is %s in the list %s? %b%n",
                value.toString(), list, containsLambda.test(list, value));

        System.out.println("Creating contains predicate using method reference");
        // equivalent BiPredicate using method reference
        BiPredicate<List<?>, T> containsMR = List::contains;
        System.out.printf("Is %s in the list %s? %b%n",
                value.toString(), list, containsMR.test(list, value));
    }

    /**
     * Example of method reference to static methods
     */
    private static void staticMethodReference() {
        System.out.println("Invoking static methods using lambda expressions");
        // Using  a  lambda  expression
        Function<Integer, String> func1 = x -> Integer.toBinaryString(x);
        System.out.printf("Binary representation of %s is %s%n", 7, func1.apply(7));

        System.out.println("Invoking static methods using method references");
        // Using  a  method  reference
        Function<Integer, String> func2 = Integer::toBinaryString;
        System.out.printf("Binary representation of %s is %s%n", 7, func2.apply(7));

        // Using  a  method  reference
        Function<String, Integer> func3 = Integer::parseInt;
        System.out.printf("Parsing string %s to int %d%n", "25", func3.apply("25"));
    }

}
