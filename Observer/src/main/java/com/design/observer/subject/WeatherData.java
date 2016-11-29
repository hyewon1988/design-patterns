package com.design.observer.subject;

import java.util.Observable;

import lombok.Getter;
import lombok.Setter;

public class WeatherData extends Observable {

	@Getter @Setter
	private float temperature;
	@Getter @Setter
	private float humidity;
	@Getter @Setter
	private float pressure;

	public WeatherData() {
	}

	public void measurementChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temparature, float humidity, float pressure){
		setTemperature(temparature);
		setHumidity(humidity);
		setPressure(pressure);
		
		measurementChanged();
	}

}
