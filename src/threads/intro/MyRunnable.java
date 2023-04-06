package threads.intro;

public class MyRunnable extends MyParent implements Runnable {

    public void run() { System.out.println(Thread.currentThread()); }

    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
    }
}
