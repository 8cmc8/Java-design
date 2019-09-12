package design.patterns.decorator.condiment.condimentDecoratorImpl;

import design.patterns.decorator.Beverage;
import design.patterns.decorator.condiment.CondimentDecorator;

/**
 * 豆浆
 */
public class Soy extends CondimentDecorator {
    //保存被装饰者引用
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = 0.15 + beverage.cost();
        //豆浆加价规则（小杯+0.10;中杯+0.15;大杯+0.20）
        if (getSize() == Beverage.TALL) {
            return cost += 0.10;
        } else if (getSize() == Beverage.GRANDE) {
            return cost += 0.15;
        } else if (getSize() == Beverage.VENTI) {
            return cost += 0.20;
        }
        return cost;
    }
}
