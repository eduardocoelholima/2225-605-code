package intro.ControlFlow;

/**
 * An example of how the ternary operator works.
 */
class TernaryOperatorDemo {
    /**
     * Main method
     * @param args arguments ignored.
     */
    public static void main(String args[]) {
        int value = 2 > 3 ? 2 : 3;
        String aString = "	 2 > 3 ? 2 : 3";
        System.out.println(aString + " = " + value);

        value = (1 > 2 ? 3 : (4 < 5 ? 6 : 7));
        aString = " 	 ( 1 > 2 ? 3 :( 4 < 5 ? 6 : 7))";
        System.out.println(aString + " = " + value);

        value = 1 > 2 ? 3 : 4 > 5 ? 8 : 7;
        aString = " 	 1 > 2 ? 3 : 4 > 5 ? 8 : 7";
        System.out.println(aString + " = " + value);
    }
}
