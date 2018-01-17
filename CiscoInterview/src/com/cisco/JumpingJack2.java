package com.cisco;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class JumpingJack2 {
	static Scanner in;
	static PrintWriter out;
 
	static void solve() {
		int sum[] = new int[2001];
		for (int i = 1; i <= 2000; i++) {
			sum[i] = sum[i-1] + i;
		}
//		int t = nextInt();
//		for (int tt = 0; tt < t; tt++) {
			int n = nextInt();
			int b = nextInt();
			int res = sum[n];
			for (int i = 1; i <= n; i++) {
				if (sum[i] == b) {
					res--;
					break;
				}
			}
			out.println(res);
//		}
	}
	
	static int sqr(int x) {
		return x*x;
	}
	
	static int nextInt() {
		return in.nextInt();
	}
 
	static long nextLong() {
		return in.nextLong();
	}
 
	static double nextDouble() {
		return in.nextDouble();
	}
 
	static BigInteger nextBigInteger() {
		return in.nextBigInteger();
	}
	
	static String next() {
		return in.next();
	}
	
	static String nextLine() {
		return in.nextLine();
	}
 
	static boolean hasNext() {
		return in.hasNext();
	}
	
	public static void main(String args[]) {
		in = new Scanner(System.in);
		out = new PrintWriter(System.out);
		//in = new BufferedReader(new FileReader("input.in"));
		//out = new PrintWriter(new FileWriter("output.out"));
		solve();
		in.close();
		out.close();
	}
}
