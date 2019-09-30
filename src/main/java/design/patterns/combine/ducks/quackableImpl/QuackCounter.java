package design.patterns.combine.ducks.quackableImpl;

import design.patterns.combine.ducks.Quackable;
import design.patterns.combine.observer.Observer;

/**
 * 包装鸭子类的装饰者类（增加统计鸭叫声的功能）
 */
public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
