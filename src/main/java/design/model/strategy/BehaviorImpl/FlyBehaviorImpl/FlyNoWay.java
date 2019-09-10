package design.model.strategy.BehaviorImpl.FlyBehaviorImpl;

import design.model.strategy.Behavior.FlyBehavior;

/**
 * 不会飞行
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
