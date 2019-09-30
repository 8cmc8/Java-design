package design.patterns.combine.ducks.quackableImpl;

import design.patterns.combine.ducks.Quackable;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
