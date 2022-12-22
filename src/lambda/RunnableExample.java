package lambda;

/**
 * Technique used when the code of the run method is small
 */
public class RunnableExample {

    public static void main(String[] args) {
        new Thread(() -> {
            int i = 0;
            while (i++ < 20) {
                if (i % 2 == 0) {
                    System.out.printf("%d is an even number%n", i);
                }
            }
        }).start();
    }
}
