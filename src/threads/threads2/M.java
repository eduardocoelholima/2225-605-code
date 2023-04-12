package threads.threads2;

import java.util.*;

public class M extends Thread    {
    private String info;
    private Vector aVector;

    public M (String info) {
        this.info    = info;
    }

    public synchronized void run () {
        System.err.println(info + ": --->");
		//try { sleep(1000); } catch (  InterruptedException e ) { }
        System.err.println(info + "<---");
    }

    public static void main (String args []) {
        Vector aVector = new Vector();
        M aT4_0 = new M("first");

        aT4_0.start();
        aT4_0.run();
    }
}
