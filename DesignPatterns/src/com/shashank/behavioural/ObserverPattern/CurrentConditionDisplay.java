package com.shashank.behavioural.ObserverPattern;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temp;
	private float humidity;

	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current Conditions " + "Temperature " + temp + " Humidity " + humidity);

	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

}
