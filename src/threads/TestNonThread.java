package threads;

/**
 * A common error made by beginners trying to run code concurrently
 */
public class TestNonThread extends Thread {

    private static final int AMOUNT = 3;

    private char charToPrint;    // the character to print
    private int times;        // The times to repeat

    /**
     * @param c character to print
     * @param t number of time to print character c
     */
    public TestNonThread(String name, char c, int t) {
        super(name);
        charToPrint = c;
        times = t;
    }

    public static void main(String args[]) {
        Thread printA = new TestNonThread("Thread A", 'a', AMOUNT);
        Thread printB = new TestNonThread("Thread B", 'b', AMOUNT);

        printA.run();
        printB.run();
    }

    public void run() {
        for (int i = 0; i <= times; i++) {
            System.out.println(currentThread().getName() + " " + charToPrint);
        }
    }
}