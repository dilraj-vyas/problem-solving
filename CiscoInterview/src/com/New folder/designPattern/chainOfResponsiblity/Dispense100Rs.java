package com.designPattern.chainOfResponsiblity;

public class Dispense100Rs implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 100) {
			int notes = currency.getAmount() / 100;
			int remainder = currency.getAmount() % 100;
			System.out.println("Dispensing " + notes + " 100 note");
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
