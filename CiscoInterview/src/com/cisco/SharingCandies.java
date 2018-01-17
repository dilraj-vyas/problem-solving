package com.cisco;

import java.util.HashMap;
import java.util.Map;

public class SharingCandies {
	public static void main(String[] args) {
		System.out.println(getPthSmallestFactor(Long.parseLong("99980000016"), 56));
	}

	public static long getPthSmallestFactor(long n, long p) {
		long factor = 0;
		Map<Long, Long> map = new HashMap<Long, Long>();
		for (long i = 1, j = 1; i <= (n / 2)+1;i++) {
			if (n % i == 0) {
				map.put(j, i);
				j++;
			}
			System.out.println((map.get(p) != null));
			if (map.get(p) != null)
			{
				factor = map.get(p);
				break;
			}
			System.out.println(map);
			System.out.println(i);
		}

		

		return factor;
	}

}
