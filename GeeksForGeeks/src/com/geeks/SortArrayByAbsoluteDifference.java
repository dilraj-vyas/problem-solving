package com.geeks;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class SortArrayByAbsoluteDifference {
	public static void main(String[] args) {
		// Map<Integer, Integer> map=new TreeMap
	}

	static class Strategy implements Comparator<Entry<Integer, Integer>> {

		@Override
		public int compare(Entry<Integer, Integer> o1,
				Entry<Integer, Integer> o2) {
			return o1.getValue().compareTo(o2.getValue());
		}

	}

}
