/*
 * is this output	--->
 *			<--
 *			...
 * the only possible output?
 * ja ein objekt
 */
public class T_2b extends Thread    {
    private String info;

    public T_2b(String info )	{
	this.info = info;
    }
    private synchronized void inProtected () {
             System.err.println("--> " + info);
             try { 
                      sleep(1000);
             } catch (  Exception e ) {
                 e.printStackTrace();
             }
             System.err.println("<-- " + info);
    }

    public void run () {
        inProtected();
    }
    public static void main (String args []) {
        new T_2b("hello").start();
        new T_2b("hello").start();

    }
}
