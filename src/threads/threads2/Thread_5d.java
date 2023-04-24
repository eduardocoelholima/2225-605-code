package threads.threads2;

import java.util.*;

public class Thread_5d extends Thread    {
        private String info;
        static Vector aVector;

        public Thread_5d (Vector aVector, String info) {
                this.aVector = aVector;
                this.info    = info;
        }

        public void inProtected () {
           synchronized ( aVector )     {
                System.err.println(info + ": is in protected()");
                try {
                         sleep(100);
                }
                catch (  InterruptedException e ) {
                        System.err.println("Interrupted!");
                }
                System.err.println(info + ": exit run");
           }
        }

        public void run () {
                inProtected();
        }

        public static void main (String args []) {
        	Vector aVector = new Vector();
            Thread_5d aT5_0 = new Thread_5d(aVector, "first");
            aT5_0.start();

            try { sleep(100); } catch (  InterruptedException e ) { System.err.println("Interrupted!"); }

        	aVector = new Vector();
            Thread_5d aT5_1 = new Thread_5d(aVector, "second");
            aT5_1.start();
        }
}
