package com.shashank.structuralPatternadapterDesignPattern;

public class DuckTestDrive {

	public static void main(String arg[]) {

		MallardDuck mDuck = new MallardDuck();
		WildTurkey wTurkey = new WildTurkey();

		// Wrap WilkTurkey around with a Adapter so that it start behaving like Duck TurkeyAdapter

		Duck turkeyAd = new TurkeyAdapter(wTurkey);
		System.out.println("Testing Turkey");
		testDuck(turkeyAd);
		System.out.println("Duck");
		testDuck(mDuck);

	}

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
