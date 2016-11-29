package com.design.observer.subject;

import java.util.ArrayList;
import java.util.List;

import com.design.observer.observers.Observer;

import lombok.Setter;

public class WeatherData implements Subject {

	private List<Observer> observers;
	@Setter
	private float temperature;
	@Setter
	private float humidity;
	@Setter
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers){
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temparature, float humidity, float pressure){
		setTemperature(temparature);
		setHumidity(humidity);
		setPressure(pressure);
		
		measurementChanged();
	}

}
