package design.model.strategy.BehaviorImpl.QuackBehaviorImpl;

import design.model.strategy.Behavior.QuackBehavior;

/**
 * 吱吱叫
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
