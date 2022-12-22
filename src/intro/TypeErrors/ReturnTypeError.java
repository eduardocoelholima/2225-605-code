package intro.TypeErrors;

public class ReturnTypeError {
    public static int multiply(int a, int b) {
        // multiply a by b and store in a variable of type int
        int result = a * b;

        // return the result
        return result;
    }

    public static int divide(float a, float b) {
        // divide a by b and store in a variable of type float
        float result = a / b;

        // return the result
//        return result;
        return 0;
    }

    public static void subtract(int a, int b) {
        int result = a - b;

        // print the result rather than return it
        System.out.println(result);
    }

    public static void add(int a, int b) {
        int result = a = b;
        // return the result
//        return result;
    }

    public static void main(String[] args) {
        // store the int return value in an int
        int a = multiply(3, 4);

        // store the int return value in a float
        float b = multiply(3, 4);

        // store a float value in an int
//        int c = b;

//        boolean d = multiply(3, 4);

        int e = divide(10, 2);

        // store the return value of subtract in an int
//        int f = subtract(4, 3);
    }
}
