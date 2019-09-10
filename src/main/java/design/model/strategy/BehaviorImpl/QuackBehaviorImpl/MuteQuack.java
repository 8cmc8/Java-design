package design.model.strategy.BehaviorImpl.QuackBehaviorImpl;

import design.model.strategy.Behavior.QuackBehavior;

/**
 * 哑巴
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
