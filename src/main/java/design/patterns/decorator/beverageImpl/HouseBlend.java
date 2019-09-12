package design.patterns.decorator.beverageImpl;

import design.patterns.decorator.Beverage;

/**
 * 综合咖啡
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
