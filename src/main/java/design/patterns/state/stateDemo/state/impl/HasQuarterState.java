package design.patterns.state.stateDemo.state.impl;

import design.patterns.state.stateDemo.GumballMachine;
import design.patterns.state.stateDemo.state.State;

import java.util.Random;

/**
 * 有25分钱（状态实现）
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ...");
        int winner = randomWinner.nextInt(10);
        //糖果数量大于1才能进入赢家状态（10%的概率）
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "Machine is waiting for you to turn crank";
    }
}
