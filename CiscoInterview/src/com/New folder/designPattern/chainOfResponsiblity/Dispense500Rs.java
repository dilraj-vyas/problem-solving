package com.designPattern.chainOfResponsiblity;

public class Dispense500Rs implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 500) {
			int notes = currency.getAmount() / 500;
			int remainder = currency.getAmount() % 500;
			System.out.println("Dispensing " + notes + " 500 note");
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
