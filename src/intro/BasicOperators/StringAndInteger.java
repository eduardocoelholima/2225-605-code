package intro.BasicOperators;

/**
 * Example of the + operator between String and Integer data types
 */
public class StringAndInteger {
    /**
     * Main method
     *
     * @param args arguments ignored.
     */
    public static void main(String[] args) {
        // in this case the + operator performs the concatenation
        // between the String literal and the integer
        System.out.println("Well, 3 + 4 = " + 7);
        // 3 and 4 are converted to strings and then concatenated to the
        // the literal Well, 3 + 4
        System.out.println("Well, 3 + 4 = " + 3 + 4);
        // parentheses take precedence before the concatenation operation
        // in this case, the addition is perform between 3 and 4
        // then the result is converted to string and concatenated to the String literal
        System.out.println("Well, 3 + 4 = " + (3 + 4));
    }
}

