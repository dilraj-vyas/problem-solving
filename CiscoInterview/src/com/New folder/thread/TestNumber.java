package com.cisco.thread;

public class TestNumber {
	public static void main(String[] args) {
		PrintNum num=new PrintNum();
		Thread thread1=new Thread(new Print1_10(num));
		Thread thread2=new Thread(new Print10_20(num));	
		thread1.start();
		thread2.start();
		
	}
}
