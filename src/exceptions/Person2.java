package exceptions;

/**
 * This Person class will throw a IllegalArgumentException
 * if the age of a person is a negative number.
 * IllegalArgumentException is an unchecked exception, therefore,
 * there is no need to declare it at the header's method
 */
public class Person2 {

    String name;
    int age;

    public Person2(String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Can't have negative age!");
        }
        this.age = age;
        this.name = name;
    }
}