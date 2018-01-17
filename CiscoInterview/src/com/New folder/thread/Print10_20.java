package com.cisco.thread;

public class Print10_20 implements Runnable {
	private PrintNum number;

	public Print10_20(PrintNum number) {
		this.number = number;
	}

	@Override
	public void run() {
		for (int i = 11; i <= 20; i++) {
			try {
				number.print10_20(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
