package threads;

public class WorkerThread extends Thread {
    private int result = 0;

    public void run() {
        // Perform a complicated, time-consuming calculation
        // and store the answer in the variable result
    }

    public static void main(String args[]) {
        WorkerThread t = new WorkerThread();
        t.start();
        while (t.isAlive()) {
        }
        System.out.println(t.result);
    }
}