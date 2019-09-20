package design.patterns.adapter.simpleAdapter.turkeyImpl;

import design.patterns.adapter.simpleAdapter.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
