package design.patterns.state.stateDemo;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        try {
            LocateRegistry.getRegistry(1088);
            Context namingContext = new InitialContext();
            String[] location = {"Chicago", "NewYork", "California"};
            for (int i = 0; i < location.length; i++) {
                GumballMachineRemote machine = (GumballMachineRemote) namingContext.lookup("rmi://localhost:1088/"+location[i]+"/GumballMachine");
                GumballMonitor gumballMonitor = new GumballMonitor(machine);
                gumballMonitor.report();
            }
        } catch (RemoteException | NamingException e) {
            e.printStackTrace();
        }
    }
}
