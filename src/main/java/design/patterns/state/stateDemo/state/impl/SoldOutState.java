package design.patterns.state.stateDemo.state.impl;

import design.patterns.state.stateDemo.GumballMachine;
import design.patterns.state.stateDemo.state.State;

/**
 * 售罄（状态实现）
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Machine is sold out, you can't insert");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there is no gumball");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "Machine is sold out";
    }
}
