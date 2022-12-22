package intro.ControlFlow;

/**
 * An example of how the continue statement works
 */
class ContinueDemo {
    /**
     * Main method
     * @param args arguments ignored.
     */
    public static void main(String[] args) {
        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;
        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p') {
                // the continue statement skips this for loop iteration and
                // transfers the control to the for statement (line 15)
                continue;
            }
            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}

