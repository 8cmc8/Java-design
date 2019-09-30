package design.patterns.combine.ducks.quackableImpl;

import design.patterns.combine.ducks.Goose;
import design.patterns.combine.ducks.Quackable;

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
