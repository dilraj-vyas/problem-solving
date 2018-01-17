package com.cisco;

import java.util.Arrays;

public class RotateArray {
	private static int maxValueIndex;

	public static void main(String[] args) {

		int[] arr = { 1, 4, 2, 3 };
		int[] rotater = { 0, 2 };
		int[] newRotaterarray = new int[rotater.length];

		for (int i = 0; i < rotater.length; i++) {
			int counter = 1;
			int temp[] = arr;

			if (rotater[i] < counter) {
				newRotaterarray[i] = arr[getMaxElementIndex(arr)];
			} else {
				while (rotater[i] >= counter) {
					temp = rotate(temp[0], temp);
					counter++;
				}
				newRotaterarray[i] = maxValueIndex;
			}

		}

		System.out.println(Arrays.toString(newRotaterarray));

	}

	public static int getMaxElementIndex(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[index] <= arr[i]) {
				index = i;
			}
		}
		return index;
	}

	public static int[] shift(int first, int second) {
		int temp = 0;
		temp = first;
		first = second;
		second = temp;
		return null;
	}

	public static int[] rotate(int first, int[] arr) {
		int max = Integer.MIN_VALUE;
		int index = 0;
		int[] temp = new int[arr.length];
		int counter = 0;
		for (int i = 1; i < arr.length; i++, counter++) {
			temp[counter] = arr[i];
			if (max < temp[counter]) {
				index = counter;
			}
		}
		temp[counter] = first;
		if (max < temp[counter]) {
			index = counter;
		}
		maxValueIndex = index;
		return temp;
	}

}
