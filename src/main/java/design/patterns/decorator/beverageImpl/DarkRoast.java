package design.patterns.decorator.beverageImpl;

import design.patterns.decorator.Beverage;

/**
 * 深度烘培咖啡
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
