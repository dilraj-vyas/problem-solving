package com.geeks;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(rotate(arr, 2)));
	}

	public static int[] rotate(int[] arr, int times) {
		int[] tempArray = new int[times];
		for (int i = 0; i < times; i++)
			tempArray[i] = arr[i];
		arr = shiftElement(arr, times);
		int j = 0;
		for (int i = arr.length - times; i < arr.length; i++) {
			arr[i] = tempArray[j];
			j++;
		}
		return arr;
	}

	public static int[] shiftElement(int[] arr, int index) {
		int pointer = index;
		for (int i = 0; i < arr.length; i++) {
			if (pointer < arr.length) {
				arr[i] = arr[pointer];
				pointer++;
			}
		}
		return arr;
	}

}
