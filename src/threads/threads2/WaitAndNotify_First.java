package threads.threads2;

import java.util.Vector;

public class WaitAndNotify_First extends Thread	{

	private static int counter = 0;
	private String  name = null;
	private Vector aVector;

	public WaitAndNotify_First (String name, Vector aVector) {
		this.aVector = aVector;
		this.name = name;
		new WaitAndNotify_First("two", aVector).start();

	}
	
	public void run () {
	   synchronized ( aVector )	{
		if (   name.equals("two")  )	{
			System.out.println(getName() + " will wait ...");
			aVector.notify();
			System.out.println(getName() + " done.");
		} else {
			System.out.println(getName() + " will wait ...");
			try {
				new WaitAndNotify_First("two", aVector).start();
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
		new WaitAndNotify_First("one", theVector).start();
	}
}
