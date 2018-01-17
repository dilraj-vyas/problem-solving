package com.cisco;

import test.CreateArray;

public class MaxDiffInArray {
	public static void main(String[] args) {
		try {
			int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			System.out.println(maxDifference(a));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public static int maxDiff(int[] arr) {
	// int max = 0;
	// int min = 0;
	//
	// for (int i = 0; i < arr.length; i++) {
	// if (arr[i] > arr[max])
	// max = i;
	// if (arr[i] <= arr[min] && i < max) {
	// min = i;
	// }
	// }
	//
	// return (arr[max] - arr[min]) > 0 ? arr[max] - arr[min] : -1;
	// }

	static int maxDifference(int[] arr) {
		int diff[] = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++)
			diff[i] = arr[i + 1] - arr[i];

		// Now find the maximum sum subarray in diff array
		int max_diff = diff[0];
		for (int i = 1; i < arr.length - 1; i++) {
			if (diff[i - 1] > 0)
				diff[i] += diff[i - 1];
			if (max_diff < diff[i])
				max_diff = diff[i];
		}

		return max_diff > 0 ? max_diff : -1;
	}
}
