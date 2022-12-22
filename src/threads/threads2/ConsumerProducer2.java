package threads.threads2;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Date;

public class ConsumerProducer2 extends Thread {


	public static void main(String args[] )	{
		int soManyC = 5;
		int soManyP = 4;
		Storage theStorage = new Storage();

		System.out.println("# producer = " + soManyP );
		System.out.println("# consumer = " + soManyC );


		for (int id = 1 ; id <= soManyP ; id ++)	{
			new Producer(id, theStorage).start();
		}
		for (int id = 1 ; id <= soManyC ; id ++)	{
			new Consumer(id, theStorage).start();
		}
	}
}

class Storage {
	static final int N = 100;
	static int soManyAreIn = 0;
	int soMany = 0; 			// counter, used for verification
	private ArrayList theStorage = new ArrayList(N);
	private Object sync = new Object();

	void test()	{
		if ( soManyAreIn != 1  )	{
			System.out.println("soManyAreIn " + soManyAreIn );
			System.exit(0);
		}
		if ( soMany > N  )	{
			System.out.println("overflow " + soMany );
			System.exit(0);
		}
		if ( soMany < 0 )	{
			System.out.println("underflow " + soMany );
			System.exit(0);
		}
		try {
			Thread.sleep(1000);
		} catch ( Exception e ) { }
	}


	void addItems(Vector addTheseItems)	{
		synchronized ( sync ) {
			System.err.println("--->" );
			soManyAreIn++;
			while  ( soMany + addTheseItems.size() > N )	{
				try {
					System.err.println("  waiting");
					soManyAreIn--;
					sync.wait();
					System.err.println("  woke up");
					soManyAreIn++;
				} catch ( InterruptedException e )	{
					e.printStackTrace();
				}
			}

			for ( int index = 0; index < addTheseItems.size(); index ++ )	{
				theStorage.add(addTheseItems.elementAt(index));
			}
			soMany += addTheseItems.size();
			test();
			soManyAreIn--;
			sync.notifyAll();
			System.err.println("<---" );
		}
	}

	Vector consume(int id)	{
		Vector aVector = new Vector(id);

		synchronized ( sync ) {
			System.err.println("	---->" );
			soManyAreIn++;
			while  ( soMany - id < 0 )	{
				try {
					soManyAreIn--;
					System.err.println("	 waiting ");
					sync.wait();
					System.err.println("	 woke up" );
					soManyAreIn++;
				} catch ( InterruptedException e )	{
					e.printStackTrace();
				}
			}
			soMany -= id;
			for ( int index = 0; index < id; index ++ )	{
				aVector.add( theStorage.remove(0) );
			}
			test();
			soManyAreIn--;
			sync.notifyAll();
			System.err.println("	<---" );
		}
		return aVector;
	}
}

class Consumer extends Thread {
	int id;
	Storage thisStorage;
	final int SO_MANY;
	Consumer(int id, Storage thisStorage)	{
		this.id = id;
		this.thisStorage = thisStorage;
		SO_MANY = id * 3;
		setName("Consumer: " + id );
		System.out.println("C: " + id );
	}
	public void run()	{
		while ( true ) {
			Vector aVector = thisStorage.consume(id);
		}
	}
}


class Producer extends Thread {
	int id;
	final int SO_MANY;
	Storage thisStorage;

	Producer(int id, Storage thisStorage)	{
		this.id = id;
		this.thisStorage = thisStorage;
		SO_MANY = id * 7;
		setName("Producer: " + id );
		System.out.println("P: " + id );
	}
	public void run()	{
		// System.out.println("P id: " + id );
		// System.out.println("P SO_MANY: " + SO_MANY );
		while ( true ) {
			Vector aVector = new Vector();
			for ( int counter = 0; counter < SO_MANY; counter ++ )	{
				aVector.add(id + "_" + new Date () );
			}
			thisStorage.addItems(aVector);
		}
	}
}
