package com.shashank.structural.DecoratorDesignPattern;

public class Expresso implements Beverages {
	@Override
	public Float cost() {
		return 10f;
	}

	@Override
	public String description() {
		return "Expresso";

	}

}
