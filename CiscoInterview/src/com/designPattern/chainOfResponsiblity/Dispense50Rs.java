package com.designPattern.chainOfResponsiblity;

public class Dispense50Rs implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 50) {
			int notes = currency.getAmount() / 50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing " + notes + " 50 note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else
			this.chain.dispense(currency);
	}

	@Override
	public void setNextChain(DispenseChain chain) {
		this.chain = chain;

	}
}
