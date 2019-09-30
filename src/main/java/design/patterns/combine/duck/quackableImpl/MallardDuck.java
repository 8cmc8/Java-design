package design.patterns.combine.duck.quackableImpl;

import design.patterns.combine.duck.Quackable;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
