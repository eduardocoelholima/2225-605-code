package threads.intro;

import java.util.ArrayList;
import java.util.List;

public class ParallelCounterSyncAlternative extends Thread{

    public static final int MAX_THREADS = 10;
    public static final int JOB_SIZE = 100000;
    private static int counter;
    private static Object lock = new Object();
    public void run() { synchronized (lock) { increment(); } }

    public static void increment() { for (int i = 0; i < JOB_SIZE; i++) counter++; }

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        for (int i=0; i<MAX_THREADS; i++) threads.add(new ParallelCounterSyncAlternative());
        for (Thread thread:threads) thread.start();
        for (Thread thread:threads) try { thread.join(); } catch (Exception e) {}
        System.out.println(ParallelCounterSyncAlternative.counter);
    }
}
