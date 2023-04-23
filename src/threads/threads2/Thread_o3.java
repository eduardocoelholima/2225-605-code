package threads.threads2;

import java.util.*;

public class Thread_o3 extends Thread    {
        private String info;
        static  Vector aVector = new Vector();

        public Thread_o3 (String info, Vector aVector) {
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
		    new Thread_o3("first", aVector).start();
		    new Thread_o3("second", new Vector()).start();
        }
}
