package com.design;

public class ExtraCheesePizza extends AbstractPizzaDecorator {
	

	public ExtraCheesePizza(Pizza pizza, Toppings toppings) {
		super(pizza, toppings);
	}

	@Override
	public Double getPrice() {
		return pizza.getPrice() + 100.0;
	}

	@Override
	public String description() {
		return pizza.description()+ " with extra cheese";
	}


}
