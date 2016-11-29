package com.design.observer.observers;

import java.util.Observable;
import java.util.Observer;

import com.design.observer.others.DisplayElement;
import com.design.observer.subject.WeatherData;

import lombok.Setter;

public class ForecastDisplay implements DisplayElement, Observer {
	
	private float currentPressure = 29.2f;
	private float lastPressure;
	@Setter
	private Observable observable;

	public ForecastDisplay(Observable observable){
		setObservable(observable);
		this.observable.addObserver(this);
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

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			float pressures = weatherData.getPressure();
			
			lastPressure = currentPressure;
			currentPressure = pressures;
			display();
		}
	}

}
