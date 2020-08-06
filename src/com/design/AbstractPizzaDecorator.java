package com.design;

public abstract class AbstractPizzaDecorator implements PizzaDecorator {

	protected Pizza pizza;
	
	private Toppings toppings;

	public AbstractPizzaDecorator(Pizza pizza, Toppings toppings) {
		super();
		this.pizza = pizza;
		this.toppings = toppings;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public void setToppings(Toppings toppings) {
		this.toppings = toppings;
	}
	
	@Override
	public String getToppings() {
		return toppings.toString();
	}

}
