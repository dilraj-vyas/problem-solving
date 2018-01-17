package com.designPattern.factory;

public abstract class Plan {
	protected Double rate;

	public abstract Double getRates();

	public void calculateBill() {

	}
}

class DomesticPlan extends Plan {

	@Override
	public Double getRates() {
		rate = 3.5;
		return rate;
	}

}

class CommercialPlan extends Plan {

	@Override
	public Double getRates() {
		rate = 7.5;
		return rate;
	}

}

class InstitutionalPlan extends Plan {

	@Override
	public Double getRates() {
		rate = 6.5;
		return rate;
	}

}
