package design.patterns.state.stateDemo.state;

/**
 * 定义状态接口
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
