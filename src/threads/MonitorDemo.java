package threads;

public class MonitorDemo {
    private static String message;

    public static void main(String[] args) {
        Object lock = new Object();

        Thread thread1 = new Thread() {
            public void run() {
                synchronized (lock) {
                    while (message == null) {
                        try {
                            System.out.println("Waiting for the message");
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println(message);
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                synchronized (lock) {
                    message = "A message from thread2";
                    lock.notify();
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}