package threads.threads2;

/*
 * Should print out 0 1 0 1 0 1 ...
 *
 *
 */
public class XXX extends Thread	{
	private String info;
	static Object o = new Object();
	static boolean oneIsRunning = false; // is static important?
					     // es wird nur ein
					     // Objekt erzeugt
	public XXX (String info) {
		this.info    = info;
	}
	public void run () {
		while ( true )	{
			synchronized ( o ) {
				o.notify();
				System.out.println(info);
				try {
					if ( ! oneIsRunning )	{
						( new XXX("1") ).start();
						oneIsRunning = true;
					}
					sleep(300);
					o.wait();
				} catch ( Exception e ) { }
			}
		}
	}
	public static void main (String args []) {
		new XXX("0").start();
	}
}
