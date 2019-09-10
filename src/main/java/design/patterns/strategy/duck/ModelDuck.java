package design.patterns.strategy.duck;

import design.patterns.strategy.behavior.impl.FlyNoWay;
import design.patterns.strategy.behavior.impl.MuteQuack;

/**
 * 模型鸭（鸭子抽象类的具体实现类）
 */
public class ModelDuck extends Duck {

    /**
     * 构造器初始化
     * 飞行行为：不会飞行
     * 叫行为：哑巴
     */
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
