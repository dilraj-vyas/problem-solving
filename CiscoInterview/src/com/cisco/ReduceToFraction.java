package com.cisco;

import java.util.Arrays;
import java.util.Scanner;

public class ReduceToFraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] fractions = new String[Integer.parseInt(sc.next())];
		for (int i = 0; i < fractions.length; i++) {
			fractions[i] = sc.next();
		}

		System.out.println(Arrays.toString(reduceFraction(fractions)));

	}

	public static String[] reduceFraction(String[] arr) {
		String[] result = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			String[] str = arr[i].split("/");
			int numerator = Integer.parseInt(str[0]);
			int denomitor = Integer.parseInt(str[1]);
			int small = numerator > denomitor ? denomitor : numerator;
			for (int j = small; j > 0; j--) {
				if (numerator % j == 0 && denomitor % j == 0) {
					result[i] = (numerator / j) + "/" + (denomitor / j);
					break;
				}

			}

		}

		return result;
	}

}
