package com.design.strategy.quack;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< ���� ���� >>");
	}

}
