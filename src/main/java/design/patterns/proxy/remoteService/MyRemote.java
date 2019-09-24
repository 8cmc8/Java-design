package design.patterns.proxy.remoteService;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程接口
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
    int calculate(int i, int j) throws RemoteException;
}
