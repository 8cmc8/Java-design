package design.patterns.strategy.duck;

import design.patterns.strategy.behavior.impl.FlyWithWings;
import design.patterns.strategy.behavior.impl.Quack;

/**
 * 野鸭（鸭子抽象类的具体实现类）
 */
public class MallardDuck extends Duck {

    /**
     * 构造器初始化
     * 飞行行为：用翅膀飞行
     * 叫行为：呱呱叫
     */
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
