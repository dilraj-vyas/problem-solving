package com.designPattern.chainOfResponsiblity;

public interface DispenseChain {
	public void dispense(Currency currency);

	public void setNextChain(DispenseChain nextChain);

}
