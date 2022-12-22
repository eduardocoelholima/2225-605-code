package lambda.lambda2;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class Person5 {
    private String name;
    private int age;

    public Person5(){
        this("Unknown", 0);
    }

    public Person5(String name) {
        this(name, 0);
    }

    public Person5(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
/**
 * Example of method reference to invoke constructors
 */
public class MakePeopleMR {

    public static void main(String[] args) {
        // method reference for creating new objects
        System.out.println("Using Supplier to call default constructor");
        Supplier<Person5> supp = Person5::new;
        Person5 p1 = supp.get();
        System.out.println(p1);

        System.out.println("Using Function to call constructor with one arg");
        Function<String, Person5> func = Person5::new;
        Person5 p2 = func.apply("Peter");
        System.out.println(p2);

        System.out.println("Using Function to call constructor with two args");
        BiFunction<String, Integer, Person5> func2 = Person5::new;
        Person5 p3 = func2.apply("Mike", 45);
        System.out.println(p3);
    }
}
