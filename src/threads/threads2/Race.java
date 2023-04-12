package threads.threads2;

import java.util.Vector;

public class Race extends Thread	{

	private String info;
	Vector aVector = new Vector();
	static int counter = 0;

	public Race (String info) {
		this.info = info;
	}
	
 	public void race() {
	   synchronized ( aVector )	{
		try {
			counter ++;
			if ( counter == 2 )	{
				new Race("ref").start();
			}
			System.err.println(info + " is ready to race!");
			aVector.wait();
			System.err.println(info + " is racing!");
		} catch ( IllegalMonitorStateException  e )	{
			System.err.println(info +
			  ": IllegalMonitorStateException");
		} catch ( InterruptedException  e )	{
			System.err.println(info +
			  ": InterruptedException");
		}
	  }
	}
	public void bang () {
		synchronized ( aVector )	{
			try {
				System.err.println(info + " is notifying!");
				aVector.notifyAll();
			} catch ( IllegalMonitorStateException  e )	{
				System.err.println(info +
				  ": IllegalMonitorStateException");
			}
			System.err.println(info + " is awake!");
		}
	}
	public void run () {
		if ( ! info.equals("ref") )
			race();
		else
			bang();
	}

	public static void main (String args []) {
		new Race("first").start();
		new Race("second").start();
	}
}
