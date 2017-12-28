package com.shashank.behavioural.TemplatePattern;

public class Coffee extends CaffeineBeverage {

	@Override
	public void addCondiments() {
		System.out.println("Add Coffee Powder and Sugar");
	}

	@Override
	public void brew() {
		System.out.println("Add Cofee In Boiling Water");
	}

}
