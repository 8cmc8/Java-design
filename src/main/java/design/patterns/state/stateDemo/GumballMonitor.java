package design.patterns.state.stateDemo;

import java.rmi.RemoteException;

/**
 * 客户端监视器
 */
public class GumballMonitor {
    //持有远程服务接口的引用
    private GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Location: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount());
            System.out.println("Current state: " + machine.getState());
            System.out.println("\n");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
