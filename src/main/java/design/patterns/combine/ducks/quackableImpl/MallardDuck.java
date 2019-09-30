package design.patterns.combine.ducks.quackableImpl;

import design.patterns.combine.ducks.Quackable;
import design.patterns.combine.observer.Observable;
import design.patterns.combine.observer.Observer;

public class MallardDuck implements Quackable {
    private Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "MallardDuck";
    }
}
