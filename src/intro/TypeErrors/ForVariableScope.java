package intro.TypeErrors;

/**
 * This example illustrates the scope
 * of the variable declare during the initialization
 * expression in a for loop
 */
public class ForVariableScope {
    /**
     * Main method
     * @param args arguments ignored.
     */
    public static void main(String[] args) {
        // the scope of index is the for loop enclosing statement
        for (int index = 0; index < 1; index++) {
            System.out.println("1. index = " + index);
        }
        //outside the for loop, index doesn't exist
//        System.out.println("2. index = " + index);
    }
}
