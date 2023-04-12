package threads.threads2;

import java.util.Vector;
import java.util.Date;


public class WaitAndNotify_3 extends Thread	{

	private String info;
	static  Vector aVector = new Vector();

	public WaitAndNotify_3 (String info, Vector aVector) {
		this.info = info;
		this.aVector = aVector;
	}
	
 	public void doTheJob() {
	   synchronized ( aVector )	{
		System.out.println(info + " is waiting. " + new Date() );
		try {
			aVector.wait(1000);
		} catch ( Exception  e )	{
			System.out.println(info + ": Exception");
			e.printStackTrace();
		}
		System.out.println(info + " is awake! " + new Date());
	  }
	}


	public void run () {
		doTheJob();
	}

	public static void main (String args []) {
		new WaitAndNotify_3("first", aVector).start();
		new WaitAndNotify_3("second", aVector).start();
		// new WaitAndNotify_3("last", aVector).start();
	}
}
