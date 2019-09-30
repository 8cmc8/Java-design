package design.patterns.combine.composite;

import design.patterns.combine.ducks.Quackable;
import design.patterns.combine.observer.Observer;

import java.util.ArrayList;

/**
 * 一群鸭子
 */
public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable duck : quackers) {
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
