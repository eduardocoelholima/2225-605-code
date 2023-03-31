package previous_exams.exam3_2221;

import java.rmi.*;

public class HelloServer {
    public static void main(String args[])
    {
        try {
            HelloInterface obj = new HelloImplementation();
            Naming.rebind("//localhost/HelloServer", obj);
            System.out.println("HelloServer bound in registry");
        } catch (Exception e) {
            System.out.println("HelloImpl err: " + e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }
    }
}
