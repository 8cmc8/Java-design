package design.patterns.combine.duck.quackableImpl;

import design.patterns.combine.duck.Goose;
import design.patterns.combine.duck.Quackable;

/**
 * 鹅转为鸭子的适配器
 */
public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
       goose.honk();
    }
}
