package design.patterns.state.stateDemo;

import design.patterns.state.stateDemo.state.State;
import design.patterns.state.stateDemo.state.impl.HasQuarterState;
import design.patterns.state.stateDemo.state.impl.NoQuarterState;
import design.patterns.state.stateDemo.state.impl.SoldOutState;
import design.patterns.state.stateDemo.state.impl.SoldState;

/**
 * 使用状态模式实现的糖果机
 * 内部状态不同，动作不同
 */
public class GumballMachine {
    State hasQuarterState;
    State noQuarterState;
    State soldOutState;
    State soldState;

    State state;
    int count;

    public GumballMachine(int count) {
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        this.count = count;
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

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ...");
        if (count != 0) {
            count -= 1;
        }
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

    public int getCount() {
        return count;
    }
}
