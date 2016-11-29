package com.design.observer.observers;

import com.design.observer.others.DisplayElement;
import com.design.observer.subject.Subject;

import lombok.Setter;

public class StatisticsPlay implements Observer, DisplayElement {

	private float tempSum = 0f;
	private int numReadings = 0;
	private float maxTemp = 0f;
	private float minTemp = 200f;
	@Setter
	private Subject weatherData;
	
	public StatisticsPlay(Subject weatherData){
		setWeatherData(weatherData);
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}

	@Override
	public void update(float temp, float humidity, float pressures) {
		
		numReadings++;
		tempSum = tempSum + temp;
		
		if(maxTemp < temp){
			maxTemp = temp;
		}
		
		if(minTemp > temp){
			minTemp = temp;
		}
		display();
	}

}
