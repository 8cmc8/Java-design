package design.patterns.observer.observer.impl;

import design.patterns.observer.observer.DisplayElement;
import design.patterns.observer.observer.Observer;
import design.patterns.observer.subject.Subject;
import design.patterns.observer.subject.impl.WeatherData;

/**
 * 天气统计布告板
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
