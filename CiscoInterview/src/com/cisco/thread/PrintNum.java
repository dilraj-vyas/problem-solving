package com.cisco.thread;

public class PrintNum {

	public void print1_10(int num) throws InterruptedException {
		synchronized (this) {
			while (num > 10)
				this.wait();

			System.out.println(Thread.currentThread().getName()+" "+num);
			this.notify();

		}

	}

	public void print10_20(int num) throws InterruptedException {
		synchronized (this) {
			while (num <= 10)
				this.wait();

			System.out.println(Thread.currentThread().getName()+" "+num);
			this.notify();

		}
	}

}
