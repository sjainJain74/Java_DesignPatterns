package com.shashank.creational.SingletonDesignPattern;

public class Singleton {

	private static Singleton singleton;

	// private constructor to force use of getInstance to create object
	private Singleton() {
	}

	// This is completely Thread safe singelton pattern , But We are taking lock of
	// complete method
	// thus it might not give good performance
	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;

	}

}
