package threads.threads2;

/*
 * is this output	--->
 *			<--
 *			...
 * the only possible output?
 * ja ein objekt
 */
public class T_2c extends Thread    {
    private String info;

    public T_2c(String info )	{
	new T_2c("hello").start();
	this.info = info;
    }
    private void inProtected () {
       synchronized ( info )       {
             System.err.println("--> " + info);
             try { 
                      sleep(1000);
             } catch (  Exception e ) {
                 e.printStackTrace();
             }
             System.err.println("<-- " + info);
       }
    }

    public void run () {
        inProtected();
    }
    public static void main (String args []) {
        new T_2c("hello").start();

    }
}
