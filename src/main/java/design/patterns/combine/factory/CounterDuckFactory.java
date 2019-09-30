package design.patterns.combine.factory;

import design.patterns.combine.ducks.Goose;
import design.patterns.combine.ducks.Quackable;
import design.patterns.combine.ducks.quackableImpl.*;

/**
 * 计数鸭子工厂（创建被装饰者包装过的鸭子）
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

    @Override
    public Quackable createGooseAdapter() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }
}
