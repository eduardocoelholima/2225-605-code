package exceptions;

class TestFinallyBlock2 {
    public static void main(String args[]) {
        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } catch (NullPointerException npe) {
            System.out.println(npe);
        } finally {
            System.out.println("finally block");
        }

        System.out.println("rest of the code...");
    }
}
