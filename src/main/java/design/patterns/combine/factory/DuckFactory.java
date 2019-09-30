package design.patterns.combine.factory;

import design.patterns.combine.ducks.Quackable;
import design.patterns.combine.ducks.quackableImpl.DuckCall;
import design.patterns.combine.ducks.quackableImpl.MallardDuck;
import design.patterns.combine.ducks.quackableImpl.RedheadDuck;
import design.patterns.combine.ducks.quackableImpl.RubberDuck;

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
}
