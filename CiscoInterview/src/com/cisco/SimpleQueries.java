package com.cisco;

import java.util.Arrays;

public class SimpleQueries {

	public static void main(String[] args) {
		int[] arr1 = { 2, 10, 5, 4, 8 };
		int[] arr2 = { 3, 1, 7, 8 };

		System.out.println(Arrays.toString(maxs1(arr1, arr2)));

	}

	public static int[] maxs(int[] nums, int[] maxes) {
		int[] result = new int[maxes.length];
		for (int i = 0; i < maxes.length; i++) {
			int maxCount = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] <= maxes[i]) {
					maxCount++;
				}
			}
			result[i] = maxCount;
		}

		return result;
	}

	public static int[] maxs1(int[] arr1, int[] arr2) {
		int[] result = new int[arr2.length];
		Arrays.sort(arr1);
		for (int i = 0; i < arr2.length; i++) {
			int maxCount = 0;
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] <= arr2[i]) {
					maxCount++;
				} else
					break;
			}
			result[i] = maxCount;
		}

		return result;
	}
	
	public static int[] working(int[] nums, int[] maxes) {
		int[] result = new int[maxes.length];
		Arrays.sort(nums);
		for (int i = 0; i < maxes.length; i++) {
			int maxCount = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] <= maxes[i]) {
					maxCount++;
				} else
					break;
			}
			result[i] = maxCount;
		}

		return result;
	}

}
