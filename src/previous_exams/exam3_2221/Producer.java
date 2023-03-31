package previous_exams.exam3_2221;

import java.util.Random;

public class Producer implements Runnable {
    private Drop drop;

    public Producer(Drop drop) { this.drop = drop; }

    public void run() {
        String importantInfo[] = { "Threads",  "are", "cool", "DONE" };
        Random random = new Random();
        for (int i = 0; i < importantInfo.length; i++) { drop.put(importantInfo[i]); }
    }
}
