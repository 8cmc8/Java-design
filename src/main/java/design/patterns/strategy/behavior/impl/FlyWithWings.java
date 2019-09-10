package design.patterns.strategy.behavior.impl;

import design.patterns.strategy.behavior.FlyBehavior;

/**
 * 用翅膀飞行
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
