package com.cisco;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class MagicalString1 {

	public static void getAllStrings(String str) {
		Queue<String> q=new LinkedList<String>();
		boolean flag = false;
		String result = "";
		String counter = "";
		String temp="";
		for (int i = 0; i < str.length(); i++) {
			temp+=(""+str.charAt(i));
			System.out.println(temp);
//			for (int j = i + 1; j < str.length(); j++) {
//				if (check(str.substring(i, j))) {
//					q.add(str.substring(i, j));
//				}
//			}
		}
		// return result;
	}

	public static boolean checkIsEquals(String str1, String str2) {
		boolean flag = false;
		if (check(str1) && check(str2))
			flag = true;
		return flag;
	}

	public static boolean check(String strname) {
		boolean flag = false;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < strname.length(); i++) {
			if (map.get(strname.charAt(i)) != null) {
				map.put(strname.charAt(i), map.get(strname.charAt(i))+1);
			} else {
				map.put(strname.charAt(i), 1);
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

		getAllStrings("aeiaaioooaauuaeiou");
		// System.out.println(str.subSequence(0, str.length()));

	}
}
