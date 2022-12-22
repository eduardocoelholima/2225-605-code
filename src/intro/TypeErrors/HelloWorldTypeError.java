package intro.TypeErrors;

import java.io.PrintStream;

/* Outputs "Hello, world!" and then exits. */
public class HelloWorldTypeError {
   public static void main(String[] args) {
       PrintStream ps;
       ps = System.out;

       ps.println("Hello, world!");

       return;
   }
}
