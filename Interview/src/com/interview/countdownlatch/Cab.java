package com.interview.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Cab {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch=new CountDownLatch(4);
		System.out.println("Cab is wating for passenger ");
		Thread t=new Thread(new TexiService(latch, 4));
		t.start();
		latch.await();
		System.out.println("Cab Started ready to go ");
	}

}

