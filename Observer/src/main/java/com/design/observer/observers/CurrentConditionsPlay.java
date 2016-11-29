package com.design.observer.observers;

import com.design.observer.others.DisplayElement;
import com.design.observer.subject.Subject;

import lombok.Setter;

public class CurrentConditionsPlay implements Observer, DisplayElement {

	@Setter
	private float temparature;
	@Setter
	private float humidity;
	@Setter
	private Subject weatherData;

	public CurrentConditionsPlay(Subject weatherData) {
		setWeatherData(weatherData);
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temparature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressures) {
		setTemparature(temp);
		setHumidity(humidity);
		display();
	}

}
