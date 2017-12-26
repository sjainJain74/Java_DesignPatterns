package com.shashank.structural.FacadeDesignPattern;

public class NonVegHotel implements Hotel {

	@Override
	public void getMenu() {
		System.out.println("Non Veg Menu");
	}

}
