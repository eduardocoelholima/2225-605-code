package threads.threads2;

public class Thread_0 extends Thread    {
    private String info;
    static Object o = new Object();

    public Thread_0 (String info) {
        this.info    = info;
    }

    public void run () {
	System.err.println(info + " ---> ");
	try { sleep(1000); } catch (  InterruptedException e ) { }
	System.err.println(info + " <--- ");
    }

    public static void main (String args []) {
        Thread_0 aT4_0 = new Thread_0("first");
        Thread_0 aT4_1 = new Thread_0("second");

        aT4_0.start();
        aT4_1.start();
    }
}
