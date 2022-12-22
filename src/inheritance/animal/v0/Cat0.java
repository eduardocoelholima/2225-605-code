package inheritance.animal.v0;

/**
 * This class shows an example of how to use the
 * super keyword to invoke the superclass constructor
 */
public class Cat0 extends Animal0 {
    public Cat0() {
        super(7); // calling the superclass constructor
        System.out.println("I'm a cat");
    }

    public static void main(String[] args) {
        Cat0 myCat = new Cat0();
    }
}
