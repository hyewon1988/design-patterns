package com.design.observer.observers;

import java.util.Observable;
import java.util.Observer;

import com.design.observer.others.DisplayElement;
import com.design.observer.subject.WeatherData;

import lombok.Setter;

public class CurrentConditionsPlay implements Observer, DisplayElement {

	@Setter
	private float temparature;
	@Setter
	private float humidity;
	@Setter
	private Observable observable;

	public CurrentConditionsPlay(Observable observable) {
		setObservable(observable);
		this.observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temparature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			setTemparature(weatherData.getTemperature());
			setHumidity(weatherData.getHumidity());
			display();
		}
	}

}
