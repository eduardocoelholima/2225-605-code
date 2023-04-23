package threads.threads2;

import java.util.*;

public class Thread_o2 extends Thread    {
        private String info;
        static  Vector aVector = new Vector();

        public Thread_o2 (String info, Vector aVector) {
            this.info = info;
		    this.aVector = aVector;
        }

        public void inProtected () {
           synchronized ( aVector )     {
                System.err.println(info + ": is in protected()");
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
        }

        public void run () {
                inProtected();
        }

        public static void main (String args []) {
        	Vector aVector = new Vector();
		    Thread_o2 aT_o0 = new Thread_o2("first", aVector);
		    Thread_o2 aT_o2 = new Thread_o2("second", new Vector());
            aT_o0.start();
            aT_o2.start();
        }
}
