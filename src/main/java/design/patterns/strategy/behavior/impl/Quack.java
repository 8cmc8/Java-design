package design.patterns.strategy.behavior.impl;

import design.patterns.strategy.behavior.QuackBehavior;

/**
 * 呱呱叫
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
