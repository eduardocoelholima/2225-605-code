package threads.threads2;
// roundrobin


public class ZeroOneTwo extends Thread    {
    private int id;
    static Object[]  synchronizedOn;
    static final int MAX_THREADS = 3;
    static final int ROUNDS = 5;
    static int     counter = 1;

    boolean thisIdHasBeenCreated = false;

    Object first;
    Object second;

    public static void init()    {
        synchronizedOn = new Object[MAX_THREADS + 1];
        for ( int index = 0; index < MAX_THREADS + 1; index ++ )
            synchronizedOn[index] = new Object();
    }
    public ZeroOneTwo(int id, Object first, Object second) {
        this.id         = id;
        this.first      = first;
        this.second     = second;
    }
    public void run() {
        for ( int index = 0; index < ROUNDS; index ++ ) {
            synchronized ( first ) {
                synchronized ( second ) {
                    second.notify();

                    System.out.println(id );

                    try {
                        if ( id < MAX_THREADS )    {
                            if ( ! thisIdHasBeenCreated )    {
                                if ( counter == MAX_THREADS  - 1 )		// ?: - why not used
                                    ( new ZeroOneTwo(counter + 1, synchronizedOn[MAX_THREADS], synchronizedOn[1]) ).start();
                                else
                                    ( new ZeroOneTwo(counter + 1, synchronizedOn[counter + 1], synchronizedOn[counter + 2] ) ).start();
                                thisIdHasBeenCreated = true;
                            }
                        }
                        counter ++;
                    } catch ( Exception e ) { }
                }
                try {
                    if (index != ROUNDS-1)
                        first.wait();
                } catch ( Exception e ) { }
            }
        }
    }
    public static void main (String args []) {
        init();
        new ZeroOneTwo(1, synchronizedOn[1], synchronizedOn[2]).start();
    }
}
