package design.patterns.strategy.behavior.impl;

import design.patterns.strategy.behavior.QuackBehavior;

/**
 * 吱吱叫
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
