package design.patterns.combine.ducks;

import design.patterns.combine.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
