package priv.xzhi.headfirst.example_02.service;

import priv.xzhi.headfirst.example_02.service.impl.CurrentConditionDisplay;
import priv.xzhi.headfirst.example_02.service.impl.WeatherData;

/**
 * Desc:
 * Created by Xzhi on 2020-02-07 19:30.
 */

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);

    }
}
