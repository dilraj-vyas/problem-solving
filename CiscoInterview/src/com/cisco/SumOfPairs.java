package com.cisco;

import java.util.HashMap;
import java.util.Map;

public class SumOfPairs {
	public static void main(String[] args) {
	int[] arr={1,0,2,4,3,5,6,7,9,8,10};	
		System.out.println(getnumOfPairs(arr, 10));	
		
	}

	public static int getnumOfPairs(int[] arr, int number) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int totalPairs = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.get(number - arr[i]) != null)
				totalPairs++;
			else
				map.put(arr[i], arr[i]);
		}

		return totalPairs;
	}

}
