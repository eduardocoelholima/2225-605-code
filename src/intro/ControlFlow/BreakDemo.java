package intro.ControlFlow;

/**
 * A example of how the break statement works
 */
class BreakDemo {
    /**
     * Main method
     * @param args arguments ignored.
     */
    public static void main(String[] args) {
        int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        int i;
        boolean foundIt = false;
        int searchfor = 12;
        for (i = 0; i < arrayOfInts.length; i++) {
            // when the number 12 is found
            // the break statement will exit the for loop
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }
        // the break statement transfers the control of the program
        // the this line below
        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}

