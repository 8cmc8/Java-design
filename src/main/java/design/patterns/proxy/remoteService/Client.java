package design.patterns.proxy.remoteService;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * 客户端（需要Remote、MyRemoteImpl_Stub）
 */
public class Client {
    public static void main(String[] args) {
        try {
            LocateRegistry.getRegistry(1088);
            Context namingContext = new InitialContext();

            //寻找RMI registry服务器上对应的Stub并返回给客户端(返回远程代理类)
            //RMI自动对Stub反序列化返回给客户端，客户端需要有Stub类（MyRemoteImpl_Stub.class）
            //客户端并不在代码中引用Stub类，而是使用远程接口（MyRemote）调用方法
            //jdk1.3之前使用Naming
            MyRemote remoteObj = (MyRemote) namingContext.lookup("rmi://localhost:1088/RemoteServer");
            System.out.println(remoteObj.sayHello());
            System.out.println(remoteObj.calculate(1,2));
        } catch (RemoteException | NamingException e) {
            e.printStackTrace();
        }
    }
}
