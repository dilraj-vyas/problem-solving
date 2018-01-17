package com.cisco.thread;

public class Print1_10 implements Runnable {
	private PrintNum number;

	public Print1_10(PrintNum number) {
		this.number = number;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				number.print1_10(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
