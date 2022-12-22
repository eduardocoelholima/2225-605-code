package threads;

import java.util.Arrays;
import java.util.List;

/**
 * Example of creating a thread by implementing the Runnable Interface
 *
 * @author Maria Cepeda
 */
public class HelloWorldRunnable implements Runnable {
    private String message;

    public HelloWorldRunnable(String message) {
        this.message = message;
    }

    public static void main(String... args) {
        List<String> greetings = Arrays.asList("hello", "ciao");
        for (String greeting : greetings) {
            // passing the Runnable object to the Thread constructor
            Thread t = new Thread(new HelloWorldRunnable(greeting));
            t.setName(greeting);
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}