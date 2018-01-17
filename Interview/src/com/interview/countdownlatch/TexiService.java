package com.interview.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class TexiService implements Runnable {

	private CountDownLatch latch;
	private int size;

	public TexiService(CountDownLatch latch, int size) {
		this.latch = latch;
		this.size = size;
	}

	public void run() {

		for (int i = 1; i <=size; i++) {
			try {
				System.out.println(i + " Passenger is arriving");	
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + " Passenger has picked cab");
			latch.countDown();
		}

	}

}
