package rmi2;

import java.rmi.*;
import java.util.ArrayList;

public class HelloC {
	public static void main(String args[] ) {
	String message = "";
	try {
		// HelloInterface obj = (HelloInterface)Naming.lookup("//spiegel.cs.rit.edu/HelloServer");
		HelloInterface obj = (HelloInterface)Naming.lookup("//localhost/HelloServer");

		message = obj.sayHello();
		System.out.println(message);

		message = obj.sayHello(3);
		System.out.println(message);

	} catch (Exception e) {
		System.out.println("HelloC exception: " +
		e.getMessage());
		e.printStackTrace();
	}
  }
}
