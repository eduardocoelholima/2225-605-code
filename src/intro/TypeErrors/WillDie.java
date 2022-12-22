package intro.TypeErrors;

/**
 * Example of attempting to invoke a method from a
 * reference type variable that refers to null
 */
class WillDie {
    public static void main(String args[]) {
        String aString = new String();
        // null is not an object, it has no methods
        aString = null;
        // this line throws a run time error
        aString.length();
    }
}

