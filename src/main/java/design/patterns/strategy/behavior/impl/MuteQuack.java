package design.patterns.strategy.behavior.impl;

import design.patterns.strategy.behavior.QuackBehavior;

/**
 * 哑巴
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
