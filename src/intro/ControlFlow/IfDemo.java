package intro.ControlFlow;

/**
 * An example of how the if statement works
 */
public class IfDemo {
    /**
     * Main method
     * @param args an integer value
     */
    public static void main(String[] args) {
        int i = Integer.valueOf(args[0]);
        if (i < 0) {
            System.out.println(i + " is negative.");
        } else if (i > 0) {
            System.out.println(i + " is positive.");
        } else {
            System.out.println(i + " is zero.");
        }
    }
}
