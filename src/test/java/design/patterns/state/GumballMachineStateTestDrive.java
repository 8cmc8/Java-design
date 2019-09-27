package design.patterns.state;

import design.patterns.state.stateDemo.GumballMachine;
import design.patterns.state.stateDemo.GumballMonitor;

import java.rmi.RemoteException;

public class GumballMachineStateTestDrive {
    public static void main(String[] args) throws RemoteException {
        GumballMachine gumballMachine = new GumballMachine(6, "California");
        System.out.println(gumballMachine);

        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();

        gumballMachine.insertQuarter();
        gumballMonitor.report();

        gumballMachine.turnCrank();
        gumballMonitor.report();

//        for (int i = 0; i < 5; i++) {
//            gumballMachine.insertQuarter();
//            gumballMachine.turnCrank();
//        }
//
//        System.out.println("\n" + gumballMachine);
    }
}
