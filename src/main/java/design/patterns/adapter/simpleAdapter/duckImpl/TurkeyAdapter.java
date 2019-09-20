package design.patterns.adapter.simpleAdapter.duckImpl;

import design.patterns.adapter.simpleAdapter.Duck;
import design.patterns.adapter.simpleAdapter.Turkey;

/**
 * 将火鸡转鸭子适配器
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
