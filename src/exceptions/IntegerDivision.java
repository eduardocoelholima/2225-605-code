package exceptions;

public class IntegerDivision {

    public static int divide(String s1, String s2) {
        return divideDeeper(s1, s2);
    }

    private static int divideDeeper (String s1, String s2){
        int op1 = Integer.parseInt(s1);
        int op2 = Integer.parseInt(s2);
        return op1 / op2;
    }

    public static void main(String[] args) {
        // Unchecked NumberFormatException: For input string: "5.3"
        IntegerDivision.divide("10", "5.3");
    }
}
