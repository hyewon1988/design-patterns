package com.design.strategy.fly;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("나는 날 수가 없단다~");
	}

}
