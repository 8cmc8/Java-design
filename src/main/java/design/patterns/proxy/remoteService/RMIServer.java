package design.patterns.proxy.remoteService;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * 服务端(需要Remote、RemoteImpl、RemoteImpl_Stub、RemoteImpl_Skeleton)
 */
public class RMIServer {
    public static void main(String[] args) {
        try {
            MyRemote remoteObj = new MyRemoteImpl();
            LocateRegistry.createRegistry(1088);
            Context namingContext = new InitialContext();
            //jdk1.3之前使用Naming
            namingContext.rebind("rmi://localhost:1088/RemoteServer", remoteObj);
            System.out.println("===启动RMI服务成功===");
        } catch (RemoteException | NamingException e) {
            e.printStackTrace();
        }
    }
}
