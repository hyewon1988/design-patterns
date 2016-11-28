package com.design.strategy.duck;

import com.design.strategy.fly.FlyWithWings;
import com.design.strategy.quack.Quack;

public class MallardDuck extends Duck{

	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("���� �� �����Դϴ�.");
		
	}

}
