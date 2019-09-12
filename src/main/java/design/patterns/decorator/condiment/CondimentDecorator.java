package design.patterns.decorator.condiment;

import design.patterns.decorator.Beverage;

/**
 * 调料抽象类
 */
public abstract class CondimentDecorator extends Beverage {
    //为了让所有的调料装饰者重新实现getDescription方法,重新抽象该方法
    public abstract String getDescription();
}
