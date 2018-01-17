package com.cisco.working;

import java.util.LinkedList;
import java.util.Queue;

class Pair<Key, Value> {
	private Key key;
	private Value value;

	public Pair(Key key, Value value) {
		this.key = key;
		this.value = value;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

}

public class IsPossible {

	public static String isPossible(int a, int b, int c, int d) {
		Queue<Pair<Integer, Integer>> list = new LinkedList<Pair<Integer, Integer>>();
		list.offer(new Pair<Integer, Integer>(a, b));

		while (!list.isEmpty()) {
			Pair<Integer, Integer> temp = list.poll();
			if (temp.getKey().equals(c) && temp.getValue().equals(d))
				return "Yes";
			int sum = temp.getKey() + temp.getValue();
			if (temp.getKey() <= c)
				list.offer(new Pair<Integer, Integer>(sum, temp.getValue()));
			if (temp.getValue() <= d)
				list.offer(new Pair<Integer, Integer>(temp.getKey(), sum));
		}

		return "No";
	}

	public static void main(String[] args) {
		System.out.println(isPossible(1, 4, 5, 9));
		System.out.println(isPossible(1, 2, 3, 6));
	}
}
