package com.shashank.behavioural.TemplatePattern;

public abstract class CaffeineBeverage {

	void prepareRecipe() {

		boilWater();
		brew();
		pourIncup();
		addCondiments();

	}

	public abstract void addCondiments();
	public abstract void brew();

	private void pourIncup() {
		System.out.println("Pour In Cup");

	}



	private void boilWater() {
		System.out.println("Boil Water");

	}

}
