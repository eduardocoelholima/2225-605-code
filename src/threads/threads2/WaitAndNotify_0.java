package threads.threads2;

import java.util.Vector;

public class WaitAndNotify_0 extends Thread	{

	private static int counter = 0;
	private String  name = null;
	private static Vector aVector;

	public WaitAndNotify_0 (String name, Vector aVector) {
		this.aVector = aVector;
		this.name = name;

	}
	
	public void run () {
	   synchronized ( aVector )	{
		if (   name.equals("two")  )	{
			System.out.println(getName() + " will wait ...");
			aVector.notify();
			System.out.println(getName() + " done.");
		} else {
			try {
				aVector.wait();
			} catch ( IllegalMonitorStateException  e )	{
				System.out.println( ": IllegalMonitorStateException");
			} catch ( InterruptedException  e )	{
				System.out.println(": InterruptedException");
			}
			System.out.println(getName() + " is awake!");
		}
	  }
	}
	public static void main (String args []) {
		Vector theVector = new Vector();
		new WaitAndNotify_0("one", theVector).start();
		new WaitAndNotify_0("two", theVector).start();
	}
}
