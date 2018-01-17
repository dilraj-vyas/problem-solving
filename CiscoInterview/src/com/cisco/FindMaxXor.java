package com.cisco;

public class FindMaxXor {
	public static void main(String[] args) {
	int max=0;
	int first=1;
	int second=10;
	for (int i = first; i <= second; i++) {
			for (int j = i; j <= second; j++) {
			max=Math.max(max, (i^j));	
			}
		}
		System.out.println(max);
	}
	
	
	static int maximum_XOR(int a, int b) {
		  int max=0;
		        for (int i = a; i <= b; i++) {
					for (int j = i; j <= b; j++) {
					max=Math.max(max, (i^j));	
					}
				}
				
			return max;
			}
}
