package rmi2;

import java.rmi.*;

public class HelloServer {

        public static void main(String args[])
        {
                // System.setSecurityManager(new RMISecurityManager());

                try {
                    HelloInterface obj = new HelloImplementation();
                    HelloInterface obj2 = new HelloImplementation();
                    HelloInterface obj3 = new HelloImplementationSleep();
                    Naming.rebind("//localhost/HelloServer", obj);
                    Naming.rebind("//localhost/HelloServer2", obj2);
                    Naming.rebind("//localhost/HelloServer3", obj3);
                    // Naming.rebind("//129.21.36.56/HelloServer", obj);
                    System.out.println("HelloServer bound in registry");
                } catch (Exception e) {
                    System.out.println("HelloImpl err: " + e.getMessage());
                    e.printStackTrace();
		    System.exit(0);
                }
        }
}
