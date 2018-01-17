package com.cisco;

import java.util.Scanner;

public class Caterpillars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalLeaves = Integer.parseInt(sc.next());
		int totalCaterpillars = Integer.parseInt(sc.next());
		int eaten[] = new int[totalCaterpillars];
		int uneatenLeaves = 0;
		for (int i = 0; i < eaten.length; i++) {
			eaten[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		for (int i = 1; i <= totalLeaves; i++) {
			int pointer = 0;
			boolean isEaten = false;
			while (pointer < eaten.length) {
				if (i % eaten[pointer] == 0) {
					isEaten = true;
				}
				pointer++;
			}
			if (!isEaten)
				uneatenLeaves++;
		}
		System.out.println(uneatenLeaves);
	}
}
