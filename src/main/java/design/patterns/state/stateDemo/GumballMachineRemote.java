package design.patterns.state.stateDemo;

import design.patterns.state.stateDemo.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程服务接口
 */
public interface GumballMachineRemote extends Remote {
    String getLocation() throws RemoteException;
    int getCount() throws RemoteException;
    State getState() throws RemoteException;
}
