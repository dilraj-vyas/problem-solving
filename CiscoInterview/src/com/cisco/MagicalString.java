package com.cisco;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicalString {

	public static String getAllStrings(String str) {
		boolean flag = false;
		char[] charArray = str.toCharArray();
		String result = "";
		String counter = "";
		for (int i = 0; i < charArray.length; i++) {
			counter += (charArray[i] + "");
			if (checkIsEquals(counter,
					(String) str.subSequence(i + 1, str.length()))) {
				result=str;
			}

		}
		
		

		return result;
	}

	public static boolean checkIsEquals(String str1, String str2) {
		boolean flag = false;
		char[] charArray = str1.toCharArray();
		char[] charArray1 = str2.toCharArray();
		if (check(charArray) && check(charArray1))
			flag = true;
		return flag;
	}

	public static boolean check(char[] charArray) {
		boolean flag = false;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (map.get(charArray[i]) != null) {
				map.put(charArray[i], map.get(charArray[i] + 1));
			} else {
				map.put(charArray[i], 1);
			}
		}

		if (map.get('0') != null && map.get('1') != null) {
			if (map.get('0').equals(map.get('1')))
				flag = true;
		}
		return flag;

	}

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);

		System.out.println(getAllStrings("11100100"));
		// System.out.println(str.subSequence(0, str.length()));

	}
}
