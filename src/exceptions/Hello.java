package exceptions;

public class Hello {
    public static void main(String[] args) {
        deep(args);
    }

    private static void deep(String[] args) {
        deeper(args);
    }

    private static void deeper(String[] args) {
        System.out.println("Hello, " + args[0] + '!');
    }
}
