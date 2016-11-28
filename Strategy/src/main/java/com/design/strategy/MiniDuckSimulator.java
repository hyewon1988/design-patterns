package com.design.strategy;

import com.design.strategy.duck.Duck;
import com.design.strategy.duck.MallardDuck;
import com.design.strategy.duck.ModelDuck;
import com.design.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
