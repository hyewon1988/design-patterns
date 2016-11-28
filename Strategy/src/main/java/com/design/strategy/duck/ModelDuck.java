package com.design.strategy.duck;

import com.design.strategy.fly.FlyNoWay;
import com.design.strategy.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("���� ���� �����Դϴ�.");
	}

}
