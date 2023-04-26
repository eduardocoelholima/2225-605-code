package threads.threads2;
// does this fix the previous one?

public class XX extends Thread	{
	private String info;
	static Object o = new Object();

	public XX (String info) {
		this.info    = info;
		synchronized ( o ) {
			if ( info.equals("0") )
				( new XX("1") ).start();
		}
	}
	public void run () {
		while ( true )	{
			synchronized ( o ) {
				System.out.println(info);
				try {
					o.notify();
					sleep(100);
					o.wait();
				} catch ( Exception e ) { }
			}
		}
	}
	public static void main (String args []) {
		new XX("0").start();
	}
}
