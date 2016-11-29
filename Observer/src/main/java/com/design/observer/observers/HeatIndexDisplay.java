package com.design.observer.observers;

import java.util.Observable;
import java.util.Observer;

import com.design.observer.others.DisplayElement;
import com.design.observer.subject.WeatherData;

import lombok.Setter;

public class HeatIndexDisplay implements DisplayElement, Observer {

	@Setter
	private float heatIndex;
	@Setter
	private Observable observable;

	public HeatIndexDisplay(Observable observable) {
		setObservable(observable);
		this.observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Heat index is " + heatIndex);
	}

	private float computeHeatIndex(float t, float rh) {
		float index = (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) + (0.00941695 * (t * t))
				+ (0.00728898 * (rh * rh)) + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh))
				+ (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 * (rh * rh * rh))
				+ (0.00000142721 * (t * t * t * rh)) + (0.000000197483 * (t * rh * rh * rh))
				- (0.0000000218429 * (t * t * t * rh * rh)) + 0.000000000843296 * (t * t * rh * rh * rh))
				- (0.0000000000481975 * (t * t * t * rh * rh * rh)));
		return index;
	}

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			float temp = weatherData.getTemperature();
			float humidity = weatherData.getHumidity();
			setHeatIndex(computeHeatIndex(temp, humidity));
			display();
		}
	}

}
