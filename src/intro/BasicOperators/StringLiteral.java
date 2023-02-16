package intro.BasicOperators;

/**
 * This program illustrates the difference between
 * the equality operator (==) and the equals method
 * when comparing reference types.
 */
public class StringLiteral {
    public static void main(String[] args) {
        // aString and bString are both literals and reference
        // to the same object at the String Pool
        String aString = "you";
        String temp = "u";
        String bString = "yo" + temp;

        // equals method compares the actual content of the object
        if ("you".equals(aString)) {
            System.out.println("1. equal");
        }
        if (bString.equals(aString)) {
            System.out.println("2. equal");
        }
        // == operator compares the memory location the variables refer to
        if ("yo" + "u" == aString) {
            System.out.println("3. ==");
        }
        if (bString == aString) {
            System.out.println("4. ==");
        }
        if (bString == "you") {
            System.out.println("5. ==");
        } else {
            System.out.println("6. !=");
        }
    }
}

