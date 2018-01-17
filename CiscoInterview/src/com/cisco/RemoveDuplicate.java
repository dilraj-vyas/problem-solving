package com.cisco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 7, 3, 3, 3, 3 };
		// Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>(arr.length);
		int sum = 0;
		int counter;
		for (int i = 0; i < arr.length; i++) {
			if (list.contains(arr[i])) {
				counter = 1;
				while (list.contains(arr[i] + counter)) {
					counter++;
				}
				sum += (arr[i] + counter);
				list.add(arr[i] + counter);
			} else {
				list.add(arr[i]);
				sum += arr[i];
			}

		}

		System.out.println(sum);
	}

}
