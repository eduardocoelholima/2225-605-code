package threads.threads2;

/*
 * is this output	--->
 *			<--
 *			...
 * the only possible output?
 * nein unterschiedliche zwei objekte
 */
public class T_2 extends Thread    {
    static String info;

    public T_2(String info )	{
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
	String aString = "a";
        T_2 one = new T_2(aString);
	one.start();
        T_2 two = new T_2(aString);
	two.start();
	aString = "b";
        // new T_2("a").start();
        // new T_2("b").start();

    }
}
