package design.patterns.state.stateDemo;

import design.patterns.state.stateDemo.state.State;
import design.patterns.state.stateDemo.state.impl.*;

/**
 * 使用状态模式实现的糖果机
 * 内部状态不同，动作不同
 */
public class GumballMachine {
    State hasQuarterState;
    State noQuarterState;
    State soldOutState;
    State soldState;
    State winnerState;

    State state;
    int count;
    String location;

    public GumballMachine(int count, String location) {
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        this.location = location;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    //弹出球
    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ...");
        if (count != 0) {
            count -= 1;
        }
    }

    //重新填球
    public void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        StringBuffer info = new StringBuffer("Location: " + location);
        info.append("\nInventory: " + count + " gumballs");
        if (state == noQuarterState) {
            info.append("\nMachine is waiting for quarter\n");
            return info.toString();
        } else if (state == soldOutState) {
            info.append("\nMachine is sold out\n");
            return info.toString();
        } else if (state == hasQuarterState) {
            info.append("\nMachine is waiting for you to turn crank\n");
            return info.toString();
        } else {
            info.append("\nMachine is being sold, please wait\n");
            return info.toString();
        }
    }
}
