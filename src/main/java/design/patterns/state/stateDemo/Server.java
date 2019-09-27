package design.patterns.state.stateDemo;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * 服务器测试类
 */
public class Server {
    public static void main(String[] args) {
        try {
            GumballMachineRemote[] machineRemotes = {new GumballMachine(8, "Chicago"),
                    new GumballMachine(4, "California"),
                    new GumballMachine(5, "NewYork")};
            LocateRegistry.createRegistry(1088);
            Context namingContext = new InitialContext();
            for (int i = 0; i < machineRemotes.length; i++) {
                namingContext.rebind("rmi://localhost:1088/" + machineRemotes[i].getLocation() +"/GumballMachine", machineRemotes[i]);
            }
            System.out.println("===启动RMI服务成功===");
        } catch (RemoteException | NamingException e) {
            e.printStackTrace();
        }
    }
}
