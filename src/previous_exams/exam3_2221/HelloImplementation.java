package previous_exams.exam3_2221;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class HelloImplementation
	extends UnicastRemoteObject
	implements HelloInterface {

	int state;
	static int counter;

        public HelloImplementation() throws RemoteException {
        }

        public void methodOne(int[] anArray) throws RemoteException {
		anArray[0] = 42;
        }
}
