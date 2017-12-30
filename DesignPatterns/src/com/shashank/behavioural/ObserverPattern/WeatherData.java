package com.shashank.behavioural.ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float presurre;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer obv) {
		observers.add(obv);

	}

	@Override
	public void removeObserver(Observer obv) {
		int i = observers.indexOf(obv);
		if (i >= 0) {
			observers.remove(obv);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer eachObv : observers) {
			eachObv.update(temperature, humidity, presurre);
		}
	}

	public void setMesurement(float temperature, float humidity, float presurre) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.presurre = presurre;
		notifyObservers();
	}

}
