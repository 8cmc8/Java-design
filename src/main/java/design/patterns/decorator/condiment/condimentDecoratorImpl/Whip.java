package design.patterns.decorator.condiment.condimentDecoratorImpl;

import design.patterns.decorator.Beverage;
import design.patterns.decorator.condiment.CondimentDecorator;

/**
 * 奶泡
 */
public class Whip extends CondimentDecorator {
    //保存被装饰者引用
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
