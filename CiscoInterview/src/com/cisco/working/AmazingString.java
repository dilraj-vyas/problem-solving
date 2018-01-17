package com.cisco.working;

import java.util.Arrays;

public class AmazingString {
	public static void main(String[] args) {
		String str[] = { "sofkfrrvoqaakwzksohvmnncpfgblidcsclggmghighzzhrjhmnvdkgxsloi"};
		System.out.println(Arrays.toString(replace(str)));
	}

	public static int[] replace(String[] words) {
		int[] operations = new int[words.length];

		for (int i = 0; i < words.length; i++) {
			int noOfIteration = 0;
			String currentString = words[i];
			for (int j = 0; j < currentString.length(); j++) {
				
				if( currentString.length() > j+1 && currentString.charAt(j)==currentString.charAt(j+1))
				{
					noOfIteration++;
					j++;
				}	
			}
			operations[i] = noOfIteration;
		}
		return operations;
	}

}
