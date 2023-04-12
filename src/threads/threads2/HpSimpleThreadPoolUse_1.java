package threads.threads2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class HpSimpleThreadPoolUse_1 {
    public static final int MAX = 2;
    public static final int SLEEP_TIME = 1000;
    public static void main(String[] args) {

	Random aRandom = new Random();
        ExecutorService executor = Executors.newFixedThreadPool(MAX);
        for (int id = 0; id < MAX * 3; id++) {	// max thread in pool
		    executor.execute( new HpWorker_1(id,  aRandom.nextInt(20) * 10 ) );
        }
        executor.shutdown();

        while ( !executor.isTerminated() ) {
		try { Thread.sleep(100); } catch ( Exception e ) { }
        }
        System.out.println("all threads have terminated");
    }

}
