package com.cisco.working;

public class FindHoles {

	public static int findHoles(int num) {
		char[] numbers = (num + "").toCharArray();
		int holes = 0;
		for (int i = 0; i < numbers.length; i++) {
			int hole = 0;
			switch (numbers[i]) {
			case '0':
				hole = 1;
				break;
			case '4':
				hole = 1;
				break;
			case '6':
				hole = 1;
				break;
			case '8':
				hole = 2;
				break;
			case '9':
				hole = 1;
				break;
			}
			holes = holes + (hole != 0 ? hole : 0);

		}
		return holes;
	}

	public static void main(String[] args) {
	System.out.println(findHoles(108888800));
		
		//int num=(int)(2.3 + 1.9);
//		System.out.println(num);
	}
}
