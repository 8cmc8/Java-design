package design.patterns.observer.observer.impl;

import design.patterns.observer.observer.DisplayElement;
import design.patterns.observer.observer.Observer;
import design.patterns.observer.subject.Subject;
import design.patterns.observer.subject.impl.WeatherData;

/**
 * 天气预报布告板
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject subject;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
