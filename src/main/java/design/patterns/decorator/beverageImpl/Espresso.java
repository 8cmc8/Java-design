package design.patterns.decorator.beverageImpl;

import design.patterns.decorator.Beverage;

/**
 * 浓缩咖啡
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
