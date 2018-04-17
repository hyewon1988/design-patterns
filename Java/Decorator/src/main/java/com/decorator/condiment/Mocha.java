package com.decorator.condiment;

import com.decorator.component.Beverage;

public class Mocha extends CondimentDecorator{
	
	public Mocha(Beverage beverage){
		setBeverage(beverage);
		setPrice(0.20);
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", mocha";
	}

}
