
// This is thread safe as When class is loaded, Static variable are initialized thus we will have the object of 
// We can use  this when Singleton Object is light and used throught the execution of program

package com.shashank.creational.SingletonDesignPattern;

public class SingletonEager {

	// When class is loaded, Static variable are initialized.
	private static SingletonEager singleton = new SingletonEager();

	// private constructor to force use of getInstance to create object
	private SingletonEager() {
	}

	public static SingletonEager getInstance() {
		return singleton;
	}

}
