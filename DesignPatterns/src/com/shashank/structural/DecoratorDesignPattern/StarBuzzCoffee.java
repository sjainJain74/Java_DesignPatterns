package com.shashank.structural.DecoratorDesignPattern;

public class StarBuzzCoffee {

	public static void main(String arg[]) {

		Beverages beverage1 = new Laate();
		System.out.println(beverage1.description() + " $" + beverage1.cost()); // 7$

		Beverages beverage2 = new Expresso(); // 10$
		beverage2 = new Whip(beverage2); // 0.1$
		System.out.println(beverage2.description() + " $" + beverage2.cost());

		Beverages beverage3 = new Expresso(); // 10$
		beverage3 = new Whip(beverage3); // 0.1$
		beverage3 = new SoyaMilk(beverage3); // 0.2$
		System.out.println(beverage3.description() + " $" + beverage3.cost());

	}

}
