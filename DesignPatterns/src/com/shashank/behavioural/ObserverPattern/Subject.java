package com.shashank.behavioural.ObserverPattern;

// Think this in term of News paper 
public interface Subject {

	void registerObserver(Observer obv);

	void removeObserver(Observer obv);

	void notifyObservers();

}
