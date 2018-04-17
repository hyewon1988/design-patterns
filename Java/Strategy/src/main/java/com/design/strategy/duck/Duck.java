package com.design.strategy.duck;

import com.design.strategy.fly.FlyBehavior;
import com.design.strategy.quack.QuackBehavior;

import lombok.Setter;

public abstract class Duck {
	@Setter
	protected FlyBehavior flyBehavior;
	@Setter
	protected QuackBehavior quackBehavior;

	public Duck() {

	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("��� ������ ���� ���. ��¥ ������ ����.");
	}
}
