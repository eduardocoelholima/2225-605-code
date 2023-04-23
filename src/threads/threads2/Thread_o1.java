package threads.threads2;

import java.util.*;

public class Thread_o1 extends Thread    {
        private String info;
        static  Vector aVector = new Vector();

        public Thread_o1 (String info) {
                this.info = info;
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
		    Thread_o1 aT_o0 = new Thread_o1("first");
		    Thread_o1 aT_o1 = new Thread_o1("second");
            aT_o0.start();
            aT_o1.start();
        }
}
