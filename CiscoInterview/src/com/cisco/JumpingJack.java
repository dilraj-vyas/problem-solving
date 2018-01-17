
package com.cisco;

import java.util.Scanner;

public class JumpingJack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		findMinSteps(n, k);
	}

	public static int findMinSteps(int n, int k) {
		int oldPos = 0;
		for (int i = 1; i <= n; i++) {
			if ((oldPos + i) != k)
				oldPos += i;
			else {
				oldPos = (oldPos - 1) + i;
			}
		}
        return oldPos;
	}
}
