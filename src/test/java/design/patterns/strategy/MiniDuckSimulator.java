package design.patterns.strategy;

import design.patterns.strategy.behavior.impl.FlyRocketPowered;
import design.patterns.strategy.duck.Duck;
import design.patterns.strategy.duck.MallardDuck;
import design.patterns.strategy.duck.ModelDuck;
import design.patterns.strategy.duck.RedHeadDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        System.out.println("================");

        Duck redHead = new RedHeadDuck();
        redHead.performFly();
        redHead.performQuack();
        System.out.println("================");

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        System.out.println("================");

        //改变modelDuck的飞行行为为火箭助力🚀
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
