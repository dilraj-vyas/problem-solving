package com.interview.cyclicbarrier;


import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cab {
	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier barrier = new CyclicBarrier(5);
		Runnable[] pessangers = { new TexiService(barrier),
				new TexiService(barrier), new TexiService(barrier),
				new TexiService(barrier), new TexiService(barrier)};
		ExecutorService service=Executors.newFixedThreadPool(5);
		for (int i = 0; i < pessangers.length; i++) {
			service.submit(pessangers[i]);
		}
	}

}
