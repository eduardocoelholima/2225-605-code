package rmi2;

import java.rmi.*;

public class HelloCSleep {
	public static void main(String args[] ) {
	String message = "";
	try {
		HelloInterface obj = (HelloInterface)Naming.lookup("//localhost/HelloServer3");

		message = obj.sayHello(1);
		System.out.println("obj: " + message);
		message = obj.sayHello(2);
		System.out.println("obj: " + message);

	} catch (Exception e) {
		System.out.println("HelloC exception: " +
		e.getMessage());
		e.printStackTrace();
	}
  }
}
