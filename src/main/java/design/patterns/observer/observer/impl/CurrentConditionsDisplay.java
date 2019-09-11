package design.patterns.observer.observer.impl;

import design.patterns.observer.observer.DisplayElement;
import design.patterns.observer.observer.Observer;
import design.patterns.observer.subject.Subject;

/**
 * 当前天气布告板
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;

        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

}
