package threads.threads2;

import java.util.Vector;

public class WaitAndNotify_2 extends Thread	{

	private String info;
	static  Vector aVector = new Vector();

	public WaitAndNotify_2 (String info, Vector aVector) {
		this.info = info;
		this.aVector = aVector;
	}
	
 	public void run() {
	   synchronized ( aVector )	{
		if (  info.equals("second") )	{
			System.out.println(info + " is waking up one");
			aVector.notifyAll();
			System.out.println(info + " done.");
		} else {
			System.out.println(info + " is waiting");
			try {
				new WaitAndNotify_2("second", aVector).start();
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
		new WaitAndNotify_2("first", aVector).start();
	}
}
