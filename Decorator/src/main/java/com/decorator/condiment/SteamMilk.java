package com.decorator.condiment;

import com.decorator.component.Beverage;

import lombok.Setter;

public class SteamMilk extends CondimentDecorator{

	public SteamMilk(Beverage beverage){
		setBeverage(beverage);
		setPrice(0.10);
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", steam milk";
	}
}
