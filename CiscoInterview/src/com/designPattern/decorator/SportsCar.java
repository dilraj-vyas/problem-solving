package com.designPattern.decorator;

public class SportsCar extends CarDecorator {
	public SportsCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("adding feature of Sports Car");
	}
}
