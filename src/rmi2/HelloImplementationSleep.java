package rmi2;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class HelloImplementationSleep
        extends UnicastRemoteObject
        implements HelloInterface {

    int state;
    static int counter;

    public HelloImplementationSleep() throws RemoteException {
    }

    public String sayHello() throws RemoteException {
        counter ++;
        System.out.println("HelloImplementationSleep!sayHello before sleep");
        try { Thread.sleep(10000); } catch (  InterruptedException e ) { }
        System.out.println("HelloImplementationSleep!sayHello after sleep");
        return  "Spiegel: Hello World my Friend!";
    }
    public String sayHello(int state) throws RemoteException {
        System.out.println("HelloImplementationSleep!sayHello(int) before sleep");
        try { Thread.sleep(10000); } catch (  InterruptedException e ) { }
        System.out.println("HelloImplementationSleep!sayHello(int) after sleep");
        this.state = state;
        counter ++;
        return  "sayHello: " + counter + "/" + state;
    }
}
