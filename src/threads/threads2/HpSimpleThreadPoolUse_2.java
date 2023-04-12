package threads.threads2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HpSimpleThreadPoolUse_2 {
    public static final int MAX = 1;
    public static final int SLEEP_TIME = 1200; // 100
    public static void main(String[] args) {
        HpThreadPool executor = new HpThreadPool(MAX);
	// is it possible to have less than max threads running?
        for (int i = 0; i < 1 + MAX * 2; i++) {
	    if ( i % 2 == 0 )
                    executor.execute(new HpWorker_1(i, 4 * SLEEP_TIME));
            else
                    executor.execute(new HpWorker_1(i, SLEEP_TIME));

        }
        executor.shutdown();

        while ( !executor.isTerminated() ) {
		System.out.println("check if terminated ...");
		try { Thread.sleep(5000); } catch ( Exception e ) { }
        }
        System.out.println("all threads have terminated");

    }
}
