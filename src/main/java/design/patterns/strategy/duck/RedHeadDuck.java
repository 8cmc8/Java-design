package design.patterns.strategy.duck;

import design.patterns.strategy.behavior.impl.FlyWithWings;
import design.patterns.strategy.behavior.impl.Squeak;

/**
 * 红头鸭（鸭子抽象类的具体实现类）
 */
public class RedHeadDuck extends Duck {

    /**
     * 构造器初始化
     * 飞行行为：用翅膀飞行
     * 叫行为：吱吱叫
     */
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a red head duck");
    }
}
