package design.patterns.combine.ducks.quackableImpl;

import design.patterns.combine.ducks.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
