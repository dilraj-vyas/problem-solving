package com.designPattern.singleton;

public class SingletonTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton instance = Singleton.getInstance();
		Singleton instance1 = (Singleton) instance.clone();
	}
}
