package com.shashank.structural.DecoratorDesignPattern;

public interface AddOnsDecorator  extends Beverages{
	// Decorator must have same supertype as object it will decorate !!
	
	
	Float cost();

	String description();

}
