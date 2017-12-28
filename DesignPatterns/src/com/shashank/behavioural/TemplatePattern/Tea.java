package com.shashank.behavioural.TemplatePattern;

public class Tea extends CaffeineBeverage {

	@Override
	public void addCondiments() {
		System.out.println("Add Ginger and Sugar");
	}

	@Override
	public void brew() {
		System.out.println("Add Tea in Boiling Water");
	}

}
