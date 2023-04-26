// wait and notify

package threads.threads2;

public class Thread_5e extends Thread    {
    static Object o = new Object();
    static int counter = 0;
    int id;
    public Thread_5e(int id)  {
        this.id = id;
        o       = new Object();
    }
    public void run () {
        if ( id == 0 )  {
                new Thread_5e(1).start();
	
                new Thread_5e(2).start();
                return;
        }
        synchronized ( o ) {
                System.err.println(id + " --->");
                try {
                        if ( counter == 0 )     {
                                counter = 1;
                                o.wait();
                        } else
                                o.notifyAll();
                }
                catch (  InterruptedException e ) { }
                System.err.println(id + " <---");
            }
    }
    public static void main (String args []) {
        new Thread_5e(0).start();
    }
}

