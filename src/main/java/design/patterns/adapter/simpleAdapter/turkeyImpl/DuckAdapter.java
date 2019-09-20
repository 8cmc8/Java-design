package design.patterns.adapter.simpleAdapter.turkeyImpl;

import design.patterns.adapter.simpleAdapter.Duck;
import design.patterns.adapter.simpleAdapter.Turkey;

import java.util.Random;

/**
 * 将鸭子转火鸡适配器
 */
public class DuckAdapter implements Turkey {
    private Duck duck;
    private Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        //让鸭子平均五次飞行一次
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
