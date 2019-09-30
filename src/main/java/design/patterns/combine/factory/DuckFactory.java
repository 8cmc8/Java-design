package design.patterns.combine.factory;

import design.patterns.combine.ducks.Goose;
import design.patterns.combine.ducks.Quackable;
import design.patterns.combine.ducks.quackableImpl.*;

/**
 * 普通鸭子工厂(没有装饰者)
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createGooseAdapter() {
        return new GooseAdapter(new Goose());
    }
}
