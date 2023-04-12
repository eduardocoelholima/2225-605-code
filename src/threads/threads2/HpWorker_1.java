package threads.threads2;

public class HpWorker_1 implements Runnable {

    private int id;
    private int sleepTime;

    public HpWorker_1(int id, int sleepTime){
        this.id         = id;
        this.sleepTime  = sleepTime;
    }
    public void run() {
	System.out.println("Start =	" + id);
	try {
	    System.err.println("active thread count: " + Thread.activeCount() );
	    Thread.sleep(sleepTime);
	    } catch (InterruptedException e) {
		    e.printStackTrace();
	}
	System.out.println("End =	" + id);
    }
    public String toString(){
	    return "HpWorker_1: " + id;
    }
}
