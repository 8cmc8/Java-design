package design.patterns.decorator.condiment.condimentDecoratorImpl;

import design.patterns.decorator.Beverage;
import design.patterns.decorator.condiment.CondimentDecorator;

/**
 * 牛奶
 */
public class Milk extends CondimentDecorator {
    //保存被装饰者引用
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
