package previous_exams.exam3_2221;

import java.util.Random;

public class ProducerStorage implements Runnable {
    private Storage drop;

    public ProducerStorage(Storage drop) {
        this.drop = drop;
    }

    public void run() {
        String importantInfo[] = { "Threads", "are", "cool", "DONE"};
        Random random = new Random();
        for (int i = 0; i < importantInfo.length; i++) { drop.put(importantInfo[i]); }
    }
}
