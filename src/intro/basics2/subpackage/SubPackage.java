package classes.basics.subpackage;

public class SubPackage {

    // class state
    static String classState = "I am a parent";

    // instance state
    String someName = "Dad";

    // instance behaviour

    /**
     * Retrieves the name of the object
     * @return name of the object
     */
    String getSomeName() {
        return someName;
    }

    // class behaviour

    /**
     * This is a function that greats the right people
     * @return the greeting
     */
    public static String greet() {
        return classState;
    }
    /*
    this is a main method
    and I like to type
    in
    several
    lines
    just
    because
     */
    public static void main(String[] args) {
        System.out.println("I am running!");
    }

}
