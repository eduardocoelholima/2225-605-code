package threads.threads2;

/*
 * is this output       --->
 *                      <--
 *                      ...
 * the only possible output?
 */
public class T_1 extends Thread    {

    private synchronized void inProtected () {
       System.err.println("--> ");
       try {
              sleep(1000);
       }
       catch (  InterruptedException e ) {
                 System.err.println("Interrupted!");
       }
       System.err.println("<-- ");
    }

    public void run () {
        inProtected();
    }
    public static void main (String args []) {
        new T_1().start();
        new T_1().start();
    }
}

