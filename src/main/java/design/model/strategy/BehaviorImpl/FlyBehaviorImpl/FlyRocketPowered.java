package design.model.strategy.BehaviorImpl.FlyBehaviorImpl;

import design.model.strategy.Behavior.FlyBehavior;

/**
 * 用火箭助力飞
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
