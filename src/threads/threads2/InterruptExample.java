package threads.threads2;

public class InterruptExample extends Thread {


    public InterruptExample(String name) {
        setName(name);
    }

    public static void sleepForAbit(long sleepTime )	{
        try {
            sleep(sleepTime);
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + " was interrupted in sleepForAbit");
        }

    }
    public void run() {

        System.err.println(getName() + " has started!");
        double x = 1;
        while ( x > 0 )	{		// forever loop
            x = x * 2 - x;		// x is constant
//            System.err.println(x);
            sleepForAbit(200);
            if ( isInterrupted() )	{
                System.err.println(Thread.currentThread().getName() + "is interrupted in run");
                System.err.println("return");
                return;
            }

        }
        System.err.println(getName() + " has exited!");
    }

    public static void main(String args[]){

        InterruptExample aThread = new InterruptExample("aThread");
        aThread.start();
        sleepForAbit(100);	// should allow the thread to enter the while loop
        aThread.interrupt();

    }
}
