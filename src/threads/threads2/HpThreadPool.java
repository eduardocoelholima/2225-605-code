package threads.threads2;

import java.util.concurrent.LinkedBlockingQueue;

public class HpThreadPool {
    private final int nThreads;
    private final Worker[] threads;
    private final LinkedBlockingQueue queue;

    private boolean shutDownThePool = false;

    public HpThreadPool(int nThreads) {
        this.nThreads = nThreads;
        queue = new LinkedBlockingQueue();
        threads = new Worker[nThreads];

        for (int i = 0; i < nThreads; i++)
            ( threads[i] = new Worker()).start();
    }

    public void execute(Runnable task) {
        if ( ! shutDownThePool )    {
            synchronized (queue) {
                queue.add(task);
                queue.notify();
            }
        }
    }
    public void shutdown() {
        synchronized (queue) {
            shutDownThePool = true;
        }
    }
    public boolean isTerminated() {
        boolean rValue = false;
            synchronized (queue) {
		    rValue = shutDownThePool && queue.isEmpty();
		    if ( rValue )    {
			for (int i = 0; i < nThreads; i++) {
				synchronized ( threads[i] )    {
				threads[i].thisIsAnActiveThread = false;
				queue.notify();
			    }
			}
            }
        }
        return rValue;
    }

    private class Worker extends Thread {
        public boolean thisIsAnActiveThread = true;
            public void run() {
                Runnable task;

                while (thisIsAnActiveThread) {
                    synchronized (queue) {
                        while (queue.isEmpty()) {
                            try {
                                queue.wait();
                                if ( !  thisIsAnActiveThread )
                                    return;
                            } catch (InterruptedException e) {
                                System.out.println("An error occurred while queue is waiting: " + e.getMessage());
                            }
                        }
                        task = (Runnable)queue.poll();
                    }

                    try {
                        task.run();
                    } catch (RuntimeException e) {
                        System.out.println("HpThreadPool: Something went wrong");
			e.printStackTrace();
                    }
                }
            }
        }
}
