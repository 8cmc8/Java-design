package design.patterns.combine.factory;

import design.patterns.combine.ducks.Quackable;
import design.patterns.combine.ducks.quackableImpl.*;

/**
 * 计数鸭子工厂（产生带计数功能的装饰者）
 */
public class CounterDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
