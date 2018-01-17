package com.cisco;

public class PrimeNo {
	public static void main(String[] args) {
		for (int i = 2; i < 50; i++) {
			int start = 2;
			boolean isPrime = true;
			while (start <= i / 2) {
				if (i % start == 0)
					isPrime = false;
				start++;
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}
