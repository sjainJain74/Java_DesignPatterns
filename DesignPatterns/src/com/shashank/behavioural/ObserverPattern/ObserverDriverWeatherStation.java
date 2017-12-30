package com.shashank.behavioural.ObserverPattern;

public class ObserverDriverWeatherStation {

	public static void main(String arg[]) {

		WeatherData weatherData = new WeatherData();

		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		System.out.println("Weather Conditions Changed");
		weatherData.setMesurement(80, 10, 20);

		System.out.println("Weather Conditions Changed");
		weatherData.setMesurement(180, 101, 120);

	}

}
