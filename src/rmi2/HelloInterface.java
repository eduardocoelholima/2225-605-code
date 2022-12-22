package rmi2;

public interface HelloInterface extends java.rmi.Remote  {
        String sayHello() throws java.rmi.RemoteException;
        String sayHello(int i) throws java.rmi.RemoteException;
}

