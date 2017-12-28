package com.shashank.structural.DecoratorDesignPattern;

public class SoyaMilk implements AddOnsDecorator {
	Beverages beverages;

	public SoyaMilk(Beverages beverage) {
		this.beverages=beverage;
	}

	@Override
	public Float cost() {
		return beverages.cost()+0.2f;
	}

	@Override
	public String description() {
		return beverages.description()+" with SoyaMilk";
	}

}
