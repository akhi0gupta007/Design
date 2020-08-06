package com.design;

public class FarmHousePizza implements Pizza {

	@Override
	public String getPizzaType() {
		return "VEG";
	}

	@Override
	public Double getPrice() {
		return 200.0;
	}

	@Override
	public String description() {
		return getPizzaType()+  ": Tasty, Farm house Pizza";
	}

}
