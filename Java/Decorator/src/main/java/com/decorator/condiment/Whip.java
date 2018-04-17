package com.decorator.condiment;

import com.decorator.component.Beverage;

import lombok.Setter;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		setBeverage(beverage);
		setPrice(0.10);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", whip";
	}
}
