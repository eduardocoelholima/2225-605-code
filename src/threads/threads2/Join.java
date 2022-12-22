package threads.threads2;

public class Join extends Thread {
	private String info;
	Join aT1;



	public Join (String info) {
		this.info = info;
	}

	public void run () {
		System.out.println(info + " is running");
		try {
			sleep(1000);
		}
		catch (  InterruptedException e ) {
			System.err.println("Interrupted!");
		}
		System.out.println(info + ": exit run");

	}
	public static void main (String args []) {
		Join aT1  = new Join("first");
		
		aT1.start();
		
		try {
		       	aT1.join();
			System.err.println("Got it");
		}
		catch (  InterruptedException e ) {
			e.printStackTrace();
		}
		System.err.println("main end");
	}
}
