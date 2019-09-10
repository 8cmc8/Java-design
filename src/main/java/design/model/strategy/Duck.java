package design.model.strategy;

import design.model.strategy.Behavior.FlyBehavior;
import design.model.strategy.Behavior.QuackBehavior;

/**
 * 鸭子基类（声明两个行为接口的变量）
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("I'm swimming");
    }

    public abstract void display();
}
