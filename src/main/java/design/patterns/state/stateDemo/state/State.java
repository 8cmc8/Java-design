package design.patterns.state.stateDemo.state;

import java.io.Serializable;

/**
 * 定义状态接口
 */
public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
