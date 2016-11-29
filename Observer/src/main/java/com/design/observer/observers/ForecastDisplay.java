package com.design.observer.observers;

import com.design.observer.others.DisplayElement;
import com.design.observer.subject.WeatherData;

import lombok.Setter;

public class ForecastDisplay implements DisplayElement, Observer {
	
	private float currentPressure = 29.2f;
	private float lastPressure;
	@Setter
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData){
		setWeatherData(weatherData);
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressures) {
		lastPressure = currentPressure;
		currentPressure = pressures;
		display();
	}

	@Override
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
