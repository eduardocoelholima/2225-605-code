package threads.threads2;

import java.util.Vector;

public class WaitAndNotify extends Thread	{

	private String info;
	static  Vector aVector = new Vector();

	public WaitAndNotify (String info, Vector aVector) {
		this.info = info;
		this.aVector = aVector;
		if ( info == "first") 
			new WaitAndNotify("second", aVector).start();
	}
	
 	public void run() {
	   synchronized ( aVector )	{
		if (  info.equals("second") )	{
			System.out.println(info + " is waking up ...");
			aVector.notifyAll();
			System.out.println(info + " done.");
		} else {
			System.out.println(info + " is waiting");
			try {
				aVector.wait();
			} catch ( IllegalMonitorStateException  e )	{
				System.out.println(info +
				  ": IllegalMonitorStateException");
			} catch ( InterruptedException  e )	{
				System.out.println(info +
				  ": InterruptedException");
			}
			System.out.println(info + " is awake!");
		}
	  }
	}
	public static void main (String args []) {
		new WaitAndNotify("first", aVector).start();
	}
}
