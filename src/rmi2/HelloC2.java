package rmi2;

import java.rmi.*;

public class HelloC2 {
	public static void main(String args[] ) {
	String message = "";
	try {
		 HelloInterface obj = (HelloInterface)Naming.lookup("//localhost/HelloServer");
		HelloInterface obj1 = (HelloInterface)Naming.lookup("//localhost/HelloServer");
		HelloInterface obj2 = (HelloInterface)Naming.lookup("//localhost/HelloServer3");

		message = obj1.sayHello(1);
		System.out.println("obj1: " + message);

		message = obj2.sayHello(2);
		System.out.println("obj1: " + message);

		// obj = (HelloInterface)Naming.lookup("//localhost/HelloServer");
		message = obj.sayHello(2);
		System.out.println("obj1: " + message);

	} catch (Exception e) {
		System.out.println("HelloC exception: " +
		e.getMessage());
		e.printStackTrace();
	}
  }
}
