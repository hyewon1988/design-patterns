package com.decorator.condiment;

import com.decorator.component.Beverage;

public class Soy extends CondimentDecorator{

	public Soy(Beverage beverage){
		setBeverage(beverage);
		setPrice(0.15);
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", soy";
	}
}
