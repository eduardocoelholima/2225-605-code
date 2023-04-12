package threads.threads2;

import java.util.*;

public class Thread_5c extends Thread    {
        private String info;
        static Vector aVector;

        public Thread_5c (Vector aVector, String info) {
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
                Thread_5c aT5_0 = new Thread_5c(new Vector(), "first");
                aT5_0.start();

                Thread_5c aT5_1 = new Thread_5c(new Vector(), "second");
                aT5_1.start();
        }
}
