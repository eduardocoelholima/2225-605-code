package threads.threads2;

import java.util.Vector;

/* is 0 1 0 1 ... the only possible output? */

public class T_8 extends Thread {

	private String info;
	private Vector aVector;

	public T_8(String info, Vector aVector) {
		this.info = info;
		this.aVector = aVector;
	}

	public void run() {
		inProtected();
	}

	public void inProtected() {
		int x = 0;
		// currently considering only 10 output pairs, but will work for
		// infinity while(true)
		while (x < 4) {
			synchronized (aVector) {

				if (info.equals("zero")) {
					System.out.println("0");
					aVector.notify();
					try {
						aVector.wait();
					} catch (InterruptedException e) {
						System.out.println(": InterruptedException");
					}
				} else {
					System.out.println("1");
					try {
						aVector.notify();
						aVector.wait();
					} catch (InterruptedException e) {
						System.out.println(": InterruptedException");
					}

				}
			}
			x++;
		}
	}

	public static void main(String args[]) {
		@SuppressWarnings("rawtypes")
		Vector aVector = new Vector();
		T_8 t0 = new T_8("zero", aVector);
		T_8 t1 = new T_8("one", aVector);

		t0.start();
		t1.start();
	}
}
