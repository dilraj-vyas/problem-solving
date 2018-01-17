package com.interview.cyclicbarrier;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class TexiService implements Runnable {

	private CyclicBarrier barrier;

	public TexiService(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	public void run() {
		
			try {
				Thread.sleep(10000);
				System.out.println(Thread.currentThread().getName()+" Passenger has arrived");
				barrier.await();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" Passenger has picked cab");
	}

}
