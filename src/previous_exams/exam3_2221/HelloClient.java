package previous_exams.exam3_2221;

import java.rmi.Naming;

public class HelloClient {
    public static void main(String args[] ) {
	try {
	  HelloInterface obj = (HelloInterface) Naming.lookup("//localhost/HelloServer");
	  obj = new HelloImplementation();
	  int[] anArray = {0, 1};
	  obj.methodOne(anArray);
	  System.out.println(anArray[0]);
	} catch (Exception e) {
		e.printStackTrace();
	}
   }
}

// Answer the questions
// 1 - What is the output of the client program?
// 2 - Explain all updates to anArray, and mention where each update happens (server or client)
