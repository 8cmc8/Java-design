package design.patterns.decorator.beverageImpl;

import design.patterns.decorator.Beverage;

/**
 * 低咖啡因咖啡
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
