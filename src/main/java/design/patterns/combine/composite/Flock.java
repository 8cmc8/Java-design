package design.patterns.combine.composite;

import design.patterns.combine.ducks.Quackable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 一群鸭子
 */
public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }
}
