package com.cisco;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class ListMax {
	static int max = 0;
	static int[] list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int listSize = Integer.parseInt(sc.next());
		list = new int[listSize];
		int operation = Integer.parseInt(sc.next());
		Operation[] operations = new Operation[operation];
		for (int i = 0; i < operations.length; i++) {
			operations[i] = new Operation(Integer.parseInt(sc.next()),
					Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		}

		for (int i = 0; i < operations.length; i++) {
			perform(operations[i]);
		}
		System.out.println(max);

	}

	public static void perform(Operation operation) {
		for (int i = operation.getStartIndex() - 1; i < operation.getEndIndex(); i++) {
			int oldValue = list[i];
			int newValue = oldValue + operation.getElement();
			if (newValue > max)
				max = newValue;
			list[i] = newValue;
		}
	}

	public int getMax() {
		return max;
	}

}

class Operation {
	int startIndex;
	int endIndex;
	int element;

	public Operation(int startIndex, int endIndex, int element) {
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.element = element;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public int getElement() {
		return element;
	}

}