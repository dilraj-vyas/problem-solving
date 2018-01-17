package com.cisco;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Braces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] expressions = {
				"{[()}]",
				"[{()()}({[]})]({}[({})])((((((()[])){}))[]{{{({({({{{{{{}}}}}})})})}}}))[][][]{",
				"[{()()}({[]})]({}[({})])((((((()[])){}))[]{{{({({({{{{{{}}}}}})})})}}}))[][][]]",
				"[{()([)}({[]})]({}[({})])((((((()[])){}))[]{{{({({({{{{{{}}}}}})})})}}}))[][][]",
				"{}[]()", "{[}]", ")", "}", "]", "[()]", "[{}]", "{][}" };
		// = new String[Integer.parseInt(sc.next())];
		// for (int i = 0; i < expressions.length; i++)
		// expressions[i] = sc.next();

		System.out.println(Arrays.toString(isBalanced(expressions)));
	}

	public static String[] isBalanced(String[] values) {
		String[] result = new String[values.length];
		for (int i = 0; i < values.length; i++) {
			char[] arr = values[i].toCharArray();
			int pointer = 0;
			Stack<Character> expression = new Stack<Character>();
			String match = "YES";
			while (pointer < arr.length) {
				if (arr[pointer] == '}' && !expression.isEmpty()) {
					if (expression.pop() != '{') {
						match = "NO";
						break;
					}
				} else if (arr[pointer] == ')' && !expression.isEmpty()) {
					if (expression.pop() != '(') {
						match = "NO";
						break;
					}
				} else if (arr[pointer] == ']' && !expression.isEmpty()) {
					if (expression.pop() != '[') {
						match = "NO";
						break;
					}
				} else {
					expression.push(arr[pointer]);
				}
				pointer++;
			}
			if (!expression.isEmpty())
				match = "NO";
			result[i] = match;

		}
		return result;
	}

}
