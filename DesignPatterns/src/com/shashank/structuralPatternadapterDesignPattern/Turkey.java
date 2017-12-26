package com.shashank.structuralPatternadapterDesignPattern;

public interface Turkey {
	
	public void gobble();   // Turkey don't quack, It gobbles
	public void fly();   //Turkey fly short distances;

}


class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("Gobble");
		
	}

	@Override
	public void fly() {
		System.out.println("Fly short Distances");
		
	}
	
	
	
}
