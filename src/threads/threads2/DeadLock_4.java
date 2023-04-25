package threads.threads2;

public class DeadLock_4 extends Thread	{
	private String info;
	Object o_1;
	Object o_2;
	static boolean oneIsRunning = false; 
					     
	public DeadLock_4 (String info, Object o_1, Object o_2)	{
		this.info    = info;
		this.o_1    = o_1;
		this.o_2    = o_2;
	}
	public void run () {
		synchronized ( o_1 ) {
			System.out.println(info);
			try {
				if ( ! oneIsRunning )	{
					new DeadLock_4("1", o_2, o_1).start();
					oneIsRunning = true;
				}
				synchronized ( o_2 ) {
					o_2.wait();
					System.out.println("I will not get there");
				}
			} catch ( Exception e ) { }
		}
	}
	public static void main (String args []) {
		Object o_1 = new Object();
		Object o_2 = new Object();
		Object stop = new Object();
		new DeadLock_4("0", o_1, o_2).start();
	}
}
