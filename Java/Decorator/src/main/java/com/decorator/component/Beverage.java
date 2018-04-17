package com.decorator.component;

import lombok.Getter;
import lombok.Setter;

public abstract class Beverage {
	@Setter @Getter
	private String description;
	@Setter @Getter
	private double cost;
}