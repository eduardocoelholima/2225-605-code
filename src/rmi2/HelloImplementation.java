package rmi2;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class HelloImplementation
        extends UnicastRemoteObject
        implements HelloInterface {

    int state;
    static int counter;

    public HelloImplementation() throws RemoteException {
    }

    public String sayHello() throws RemoteException {
        counter ++;
        return  "Spiegel: Hello World my Friend!";
    }
    public String sayHello(int state) throws RemoteException {
        this.state = state;
        counter ++;
        return  "sayHello: " + counter + "/" + state;
    }
}
