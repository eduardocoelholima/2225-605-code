package threads;

import java.util.Arrays;
import java.util.List;

/**
 * Example of creating a thread by extending from Thread
 *
 * @author Maria Cepeda
 */
public class HelloWorldThreads extends Thread {
    private String message;

    public HelloWorldThreads(String message) {
        // naming threads is helpful for debugging
        super(message + " Thread");
        this.message = message;
    }

    public static void main(String... args) {
        List<String> greetings = Arrays.asList("hello", "ciao");
        for (String greeting : greetings) {
            new HelloWorldThreads(greeting).start();
        }
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}