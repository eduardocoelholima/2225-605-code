package threads.threads2;

import java.util.*;

public class CoresTest extends Thread    {
    static final int soManyThreads  = Runtime.getRuntime().availableProcessors();
    static final int soOftenPerThread = 1000000000;
    static final int multiplier       = 1000000000;
    static long milliSeconds = 0;
    double result = 0;
    int id;

    public CoresTest(int index)	{
	id = index;
    }
    public static void init()  {
        milliSeconds = System.currentTimeMillis();
    }
    public static void end(String s)   {
        System.err.println(s + ":       " + ( System.currentTimeMillis() - milliSeconds) );
        System.err.println(" # of cores" +   ":       " +
					 Runtime.getRuntime().availableProcessors() );
    }
    public void singleThreadTest (int soOften) {
	for (int index = 0; index < soOften; index ++ )		{
		for (int k = 0; k < multiplier; k ++ )		{
			result = Math.sqrt(index) + Math.sqrt(index) + Math.sqrt(index);
		}
	}
    }
    public void run () {
	singleThreadTest(soOftenPerThread);
    }
    public static void main (String args []) {
        CoresTest single = new CoresTest(0);
        CoresTest[] many   = new CoresTest[soManyThreads];
        CoresTest o = null;
/*
	init();
		single.singleThreadTest(soOftenPerThread * soManyThreads);
	end("Single Thread Test");
*/

	init();
		for ( int index = 0; index < soManyThreads; index ++ )	{
			many[index] = new CoresTest(soOftenPerThread);
			many[index].start();
		}
		try { 
			for ( int index = 0; index < soManyThreads; index ++ )	{
				many[index].join();
			}
		} catch (Exception e ) {
			e.printStackTrace();}
	end("Multiple Core Test");
    }
}
