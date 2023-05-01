package threads.threads2;
// alternating
// what is the output?
// only one possible?

public class X extends Thread	{
	private String info;
	static Object o = new Object();
	public X (String info) {
		this.info    = info;
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
		( new X("0") ).start();
		( new X("1") ).start();
	}
}
