package com.designPattern.chainOfResponsiblity;

import java.util.concurrent.locks.ReentrantLock;


public class ATMDispense {
	DispenseChain d1;

	public ATMDispense() {
		d1 = new Dispense500Rs();
		DispenseChain d2 = new Dispense100Rs();
		DispenseChain d3 = new Dispense50Rs();
		d1.setNextChain(d2);
		d2.setNextChain(d3);
	}

	public static void main(String[] args) {
		ATMDispense atmDispense = new ATMDispense();
		atmDispense.d1.dispense(new Currency(750));
		
	}

}
