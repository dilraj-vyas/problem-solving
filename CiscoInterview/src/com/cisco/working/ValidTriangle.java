package com.cisco.working;

public class ValidTriangle {
	public static void main(String[] args) {
		int[] a = { 7, 10, 7 };
		int[] b = { 2, 3, 4 };
		int[] c = { 2, 7, 4 };
	}

	public static String[] checkValidTriangle(int[] a, int[] b, int[] c) {
		String[] result = new String[a.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = "No";
			if (getMax(a[i], b[i], c[i]) == a[i]) {
				if (a[i] < (b[i] + c[i]))
					result[i] = "Yes";
			} else if (getMax(a[i], b[i], c[i]) == b[i]) {
				if (b[i] < (a[i] + c[i]))
					result[i] = "Yes";
			} else {
				if (c[i] < (a[i] + b[i]))
					result[i] = "Yes";
			}
		}
		return result;
	}

	public static int getMax(int a, int b, int c) {

		int max = Math.max(a, b);
		max = Math.max(max, c);
		return max;
	}
}
