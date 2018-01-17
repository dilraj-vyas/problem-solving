package com.designPattern.factory;

public class FactoryMethodDesignTest {
	public static void main(String[] args) {
		Plan p = PlanFactory.getPlan("DOMESTICPLAN");
		System.out.println(p.getRates());
	}
}
