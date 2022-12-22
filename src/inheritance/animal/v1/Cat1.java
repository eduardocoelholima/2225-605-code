package inheritance.animal.v1;

/**
 * This class shows an example of how to use
 * the super keyword to invoke a method from the superclass
 */
public class Cat1 extends Animal1 {
    public Cat1() {
        super(7);
    }

    public void whoIAm() {
        super.whoIam(); // calling the superclass whoIAm method
        System.out.println("I'm a cat");
    }

    public static void main(String[] args) {
        Cat1 myCat = new Cat1();
        myCat.whoIAm();
    }
}

