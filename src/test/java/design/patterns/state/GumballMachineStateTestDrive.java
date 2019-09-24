package design.patterns.state;

import design.patterns.state.stateDemo.GumballMachine;

public class GumballMachineStateTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(6);
        System.out.println(gumballMachine);

        for (int i = 0; i < 5; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }

        System.out.println("\n" + gumballMachine);
    }
}
