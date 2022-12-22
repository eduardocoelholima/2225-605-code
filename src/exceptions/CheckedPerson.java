package exceptions;

/**
 * This Person class will throw an AgeException
 * if the age of a person is a negative number.
 * AgeException is a checked exception, therefore,
 * the compiler force us to handle the exception.
 * In this case, we have declared this method may
 * throw this type of exception.
 */
public class CheckedPerson {

    String name;
    int age;

    public CheckedPerson(String name, int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("Can't have negative age!", age);
        }
        this.age = age;
        this.name = name;
    }
}