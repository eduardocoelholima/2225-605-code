package threads;

public class TestJoin extends Thread {
    private String info;

    public TestJoin(String info) {
        this.info = info;
    }

    public static void main(String args[]) {
        TestJoin aT1 = new TestJoin("first");
        aT1.start();
        try {
            aT1.join();
            System.out.println("Got it");
        } catch (InterruptedException e) {
            System.err.println("Interrupted!");
        }
        System.out.println("main end");
    }

    @Override
    public void run() {
        System.out.println(info + " is running");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Interrupted!");
        }
        System.out.println(info + ": exit run");
    }
}