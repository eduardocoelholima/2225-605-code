package previous_exams.exam3_2221;

import java.util.Random;

public class Consumer implements Runnable {
    private Drop drop;

    public Consumer(Drop drop) { this.drop = drop; }

    public void run() {
        Random random = new Random();
        for (String message = drop.take(); !message.equals("DONE"); message = drop.take())
            System.out.format("MESSAGE RECEIVED: %s%n", message);
    }
}
