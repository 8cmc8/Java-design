package design.patterns.strategy.behavior.impl;

import design.patterns.strategy.behavior.FlyBehavior;

/**
 * 用火箭助力飞
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
