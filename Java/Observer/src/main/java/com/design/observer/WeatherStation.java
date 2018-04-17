package com.design.observer;

import com.design.observer.observers.CurrentConditionsPlay;
import com.design.observer.observers.ForecastDisplay;
import com.design.observer.observers.HeatIndexDisplay;
import com.design.observer.observers.StatisticsPlay;
import com.design.observer.subject.WeatherData;

public class WeatherStation {
	public static void main(String args[]) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsPlay currentDisplay = new CurrentConditionsPlay(weatherData);
		StatisticsPlay statistics = new StatisticsPlay(weatherData);
		ForecastDisplay forecasts = new ForecastDisplay(weatherData);
		HeatIndexDisplay heats = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
