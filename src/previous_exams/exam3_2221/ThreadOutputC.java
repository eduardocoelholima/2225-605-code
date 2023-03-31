package previous_exams.exam3_2221;

public class ThreadOutputC extends Thread {
        private String id;
        static Object o = new Object();

        public ThreadOutputC (String id) {
            this.id = id;
            if ( id.equals("0") ) ( new ThreadOutputC("1") ).start();
        }
        public void run () {
            while ( true )	{
                synchronized ( o ) {
                    System.out.println(id);
                    try {
                        o.notify();
                        sleep(100);
                        o.wait();
                    } catch ( Exception e ) { }
                }
            }
        }
        public static void main (String args []) { new ThreadOutputC("0").start(); }
    }

// Answer the questions.
//1 - What are the expected outputs? (If there is more than one possible output, mention all possible alls)
//2 - Will this program ever run into a deadlock? Why?
