package threads.intro;

import java.util.ArrayList;
import java.util.List;

public class ParallelCounterSyncMistake extends Thread{

    public static final int MAX_THREADS = 10;
    public static final int JOB_SIZE = 100000;
    private static int counter;

    public void run() { increment(); }

    synchronized public void increment() { for (int i = 0; i < JOB_SIZE; i++) counter++; }

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        for (int i=0; i<MAX_THREADS; i++) threads.add(new ParallelCounterSyncMistake());
        for (Thread thread:threads) thread.start();
        for (Thread thread:threads) try { thread.join(); } catch (Exception e) {}
        System.out.println(ParallelCounterSyncMistake.counter);
    }
}
