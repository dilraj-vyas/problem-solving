package com.cisco;

public class BalanceSalesArray {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 2, 5 };
		System.out.println(getBalancePosition(arr));
	}

	public static int getBalancePosition(int[] arr) {
		int rightSum = 0;
		int leftSum = 0;
		for (int i = 0; i < arr.length; i++)
			rightSum += arr[i];

		for (int i = 0; i < arr.length; i++) {
			rightSum -= arr[i];
			if (leftSum == rightSum) {
				return i;
			}
			leftSum += arr[i];
		}
		return -1;
	}
}
