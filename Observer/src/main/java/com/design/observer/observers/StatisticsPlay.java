package com.design.observer.observers;

import java.util.Observable;
import java.util.Observer;

import com.design.observer.others.DisplayElement;
import com.design.observer.subject.WeatherData;

import lombok.Setter;

public class StatisticsPlay implements Observer, DisplayElement {

	private float tempSum = 0f;
	private int numReadings = 0;
	private float maxTemp = 0f;
	private float minTemp = 200f;
	@Setter
	private Observable observable;

	public StatisticsPlay(Observable observable) {
		setObservable(observable);
		this.observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			float temp = weatherData.getTemperature();

			numReadings++;
			tempSum = tempSum + temp;

			if (maxTemp < temp) {
				maxTemp = temp;
			}

			if (minTemp > temp) {
				minTemp = temp;
			}
			display();
		}
	}

}
