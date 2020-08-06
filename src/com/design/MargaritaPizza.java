package com.design;

public class MargaritaPizza implements Pizza {

	@Override
	public String getPizzaType() {
		return "NON-VEG";
	}

	@Override
	public Double getPrice() {
		return 350.0;
	}

	@Override
	public String description() {
		return getPizzaType()+ " :Tasty, Farm house Pizza";
	}

}
