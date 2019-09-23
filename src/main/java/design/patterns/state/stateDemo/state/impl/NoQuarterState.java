package design.patterns.state.stateDemo.state.impl;

import design.patterns.state.stateDemo.GumballMachine;
import design.patterns.state.stateDemo.state.State;

/**
 * 没有25分钱（状态实现）
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
