package design.patterns.observer;

import design.patterns.observer.observer.impl.CurrentConditionsDisplay;
import design.patterns.observer.observer.impl.ForecastDisplay;
import design.patterns.observer.observer.impl.StatisticsDisplay;
import design.patterns.observer.subject.impl.WeatherData;

/**
 * 气象站测试类
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        System.out.println("======模拟第一次测量======");
        weatherData.setMeasurements(80, 65, 34.5f);
        System.out.println("======模拟第二次测量======");
        weatherData.setMeasurements(85,70,20.4f);
        System.out.println("======模拟第三次测量======");
        weatherData.setMeasurements(70, 50, 25.4f);
    }
}
