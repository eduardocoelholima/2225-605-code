package threads.threads2;

import java.util.*;

public class Thread_5b extends Thread    {
        private String info;
        private Vector aVector = new Vector();

        public Thread_5b (String info) {
                this.info = info;
        }

        public void inProtected () {
           synchronized ( aVector )     {
                System.err.println(info + ": is in protected()");
                try {
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
                Thread_5b aT5_0 = new Thread_5b("first");
                Thread_5b aT5_1 = new Thread_5b("second");

                aT5_0.start();
                aT5_1.start();
        }
}
