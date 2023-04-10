/*
 * Should print out 0 1 0 1 0 1 ...
 * Is this correct?
 *
 * nicht richtig,
 * weil der Konstruktor fuer das Objekt mit der Id 0
 * nicht zuende gehen muss bevor der 2. Konstruktor
 * zuende geht.
 * 
 */
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
