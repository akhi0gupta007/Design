package com.design;

public class DecoratorTest {

	public static void main(String[] args) {
		Pizza pizza = new FarmHousePizza();
		ExtraCheesePizza extraCheese = new ExtraCheesePizza(pizza, Toppings.EXTRACHEESE);
		System.out.println(extraCheese.description());
		System.out.println(extraCheese.getToppings());		
		System.out.println(extraCheese.getPrice());
	}

}
