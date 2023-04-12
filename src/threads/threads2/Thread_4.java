package threads.threads2;

import java.util.*;

public class Thread_4 extends Thread    {
    private String info;
    private Vector aVector;

    public Thread_4 (String info, Vector aVector) {
        this.info    = info;
        this.aVector = aVector;
    }

    private synchronized void inProtected () {
        System.err.println(info + ": is in protected()");
        aVector.addElement(info);
        try {
            if ( info.equals("second") )
                sleep(1000);
            else
                sleep(3000);
        }
        catch (  InterruptedException e ) {
            System.err.println("Interrupted!");
        }
        System.err.println(info + ": exit run");
    }

    public void run () {
        inProtected();
    }

    public static void main (String args []) {
        Vector aVector = new Vector();
        Thread_4 aT4_0 = new Thread_4("first",  aVector);
        Thread_4 aT4_1 = new Thread_4("second", aVector);

        aT4_0.inProtected();
        aT4_0.start();
    }
}
