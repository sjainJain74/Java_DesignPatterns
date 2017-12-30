package com.shashank.behavioural.StrategyPattern;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Do Not Fly");
	}

}
