package com.shashank.behavioural.StrategyPattern;

public class Duck {

	FlyBehaviour flybehariour;

	public void swim() {
		System.out.println("Duck Swim");
	}

	public void flyDuck() {
		flybehariour.fly();
	}

}
