package com.shashank.structuralPatternadapterDesignPattern;

public class TurkeyAdapter implements Duck {

	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		System.out.println("Turkey fly");
		
	}
}
