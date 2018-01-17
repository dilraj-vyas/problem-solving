package com.cisco;

import java.util.HashMap;
import java.util.Map;

public class BalanceString {
	public static void main(String[] args) {
System.out.println(IsBalance("ababddd"));
	}

	public static boolean IsBalance(String str) {
		boolean isBalance = false;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		if (!str.isEmpty()) {
			for (int i = 0; i < str.length(); i++) {
				if (map.get(str.charAt(i)) != null)
					map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
				else
					map.put(str.charAt(i), 1);
			}
			if (!map.isEmpty()) {
				int a = map.get('a') != null ? map.get('a') : 0;
				int b = map.get('b') != null ? map.get('b') : 0;
				int c = map.get('c') != null ? map.get('c') : 0;
				int d = map.get('d') != null ? map.get('d') : 0;
				if ((a + c) % 2 == 0 && (b + d) % 2 == 0)
					isBalance = true;
			}
		}

		return isBalance;
	}
	
	
}
