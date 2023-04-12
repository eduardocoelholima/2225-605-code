package threads.threads2;

/*
 * is this output	--->
 *			<--
 *			...
 * the only possible output?
 * nur ein objekt wird benutzt
 */
public class T_4 extends Thread    {
   
    static Object o = new Object();
    String info;

    public T_4(String info )    {
        this.info = info;
    }     

    public void run () {
        synchronized ( o ) { 
            System.err.println("--->" + info);
            try {
                    sleep(1000);
            }
            catch (  InterruptedException e ) {
                System.err.println("Interrupted!");
            }
            System.err.println("<---" + info);
        }
    }

    public static void main (String args []) {
        new T_4("1").start();
        new T_4("2").start();
        new T_4("3").start();
    }
}
