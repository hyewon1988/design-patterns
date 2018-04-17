package com.decorator;

import com.decorator.component.Beverage;
import com.decorator.component.DarkRoast;
import com.decorator.component.Espresso;
import com.decorator.component.HouseBlend;
import com.decorator.condiment.Mocha;
import com.decorator.condiment.Soy;
import com.decorator.condiment.Whip;

public class MonkeyCoffee {
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $"+ beverage.getCost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $"+ beverage2.getCost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $"+ beverage3.getCost());
	}
}
