package design.patterns.observer;

import design.patterns.observer.observable.CurrentConditionsDisplay;
import design.patterns.observer.observable.ForecastDisplay;
import design.patterns.observer.observable.StatisticsDisplay;
import design.patterns.observer.observable.WeatherData;

/**
 * 使用java内置类(java.util.Observable)和内置接口(java.util.Observer)
 * 更新观察者的顺序为：观察者订阅可观察者顺序的倒序
 *
 * Observable.notifyObservers（）部分源码
 * for (int i = arrLocal.length-1; i>=0; i--)
 *      ((Observer)arrLocal[i]).update(this, arg);
 *
 */
public class WeatherStationUseJavaApi {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        System.out.println("======模拟第一次测量======");
        weatherData.setMeasurementsChanged(80, 65, 34.5f);
        System.out.println("======模拟第二次测量======");
        weatherData.setMeasurementsChanged(85,70,20.4f);
        System.out.println("======模拟第三次测量======");
        weatherData.setMeasurementsChanged(70, 50, 25.4f);
    }
}
