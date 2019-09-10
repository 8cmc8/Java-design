package design.model.strategy.BehaviorImpl.QuackBehaviorImpl;

import design.model.strategy.Behavior.QuackBehavior;

/**
 * 呱呱叫
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
