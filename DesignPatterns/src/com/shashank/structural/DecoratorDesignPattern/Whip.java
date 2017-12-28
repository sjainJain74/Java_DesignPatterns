package com.shashank.structural.DecoratorDesignPattern;

public class Whip implements AddOnsDecorator {
	Beverages beverages;

	public Whip(Beverages beverages) {
		this.beverages=beverages;
	}

	@Override
	public Float cost() {
		return beverages.cost()+0.1f;
	}

	@Override
	public String description() {
		return beverages.description()+" with Whip";
	}

}
