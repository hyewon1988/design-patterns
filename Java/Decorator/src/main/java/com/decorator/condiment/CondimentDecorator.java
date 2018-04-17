package com.decorator.condiment;

import com.decorator.component.Beverage;

import lombok.Getter;
import lombok.Setter;

public abstract class CondimentDecorator extends Beverage{
	@Getter @Setter
	private double price;
	@Setter
	public Beverage beverage;
	
	public double getCost(){
		return beverage.getCost() + price;
	}
}
