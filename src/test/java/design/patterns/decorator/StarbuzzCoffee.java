package design.patterns.decorator;

import design.patterns.decorator.beverageImpl.DarkRoast;
import design.patterns.decorator.beverageImpl.Decaf;
import design.patterns.decorator.beverageImpl.Espresso;
import design.patterns.decorator.beverageImpl.HouseBlend;
import design.patterns.decorator.condiment.condimentDecoratorImpl.Milk;
import design.patterns.decorator.condiment.condimentDecoratorImpl.Mocha;
import design.patterns.decorator.condiment.condimentDecoratorImpl.Soy;
import design.patterns.decorator.condiment.condimentDecoratorImpl.Whip;

import java.math.BigDecimal;

/**
 * 订购咖啡测试类
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $ " + trans(beverage1.cost()));

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + trans(beverage2.cost()));

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Milk(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + trans(beverage3.cost()));

        Beverage beverage4 = new Decaf();
        beverage4.setSize(Beverage.GRANDE);
        beverage4 = new Soy(beverage4);
        System.out.println(beverage4.getDescription() + " $ " + trans(beverage4.cost()));
    }

    //四舍五入保留两位小数
    static double trans(double cost) {
        return new BigDecimal(cost).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
