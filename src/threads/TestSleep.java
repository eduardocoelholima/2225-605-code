package threads;

public class TestSleep extends Thread {

    private static int x = 0;
    private int info;

    public TestSleep(int info) {
        this.info = info;
    }

    public static void main(String args[]) {
        TestSleep aT1 = new TestSleep(1);
        TestSleep aT2 = new TestSleep(2);
        aT1.start();
        aT2.start();
        System.out.println(x);
    }

    public void run() {
        if (info == 1) {
            x = 3;
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.err.println("Interrupted!");
            }
        } else {
            x = 1;
        }
    }
}
