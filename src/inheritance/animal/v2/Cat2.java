package inheritance.animal.v2;

/**
 * This is an example of how to use the super keyword
 * to access the hiding instance variable lives from the superclass
 */
public class Cat2 extends Animal2 {
    int lives = 7;

    public Cat2() {
        super(1);
    }

    public static void main(String[] args) {
        Cat2 myCat = new Cat2();
        myCat.whoIAm();
    }

    public void whoIAm() {
        super.whoIam();
        System.out.format("I have %s life%n", super.lives); // accessing superclass lives variable
        System.out.println("I'm a cat");
        System.out.format("I have %s lives%n", this.lives); // accessing instance variable lives
    }
}