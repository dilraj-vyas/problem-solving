package com.cisco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CutTheSticks {
	public static void main(String[] args) {
		// int[] arr = { 5, 4, 4, 2, 2, 8 };
		// int[] arr = { 1, 2, 3, 4, 3, 3, 2, 1 };
		int[] arr = { 5, 4, 10, 3, 6, 2 };
		System.out.println(cutSticks(arr));
	}

	public static List<Integer> cutSticks(int[] arr) {
		Queue<Integer> queue = new LinkedList<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] - arr[0] > 0) {
				queue.offer(arr[i] - arr[0]);
			}
		}
		list.add(arr.length);
		while (true) {
			if (queue.isEmpty()) {
				break;
			} else {
				int min = queue.peek();
				list.add(queue.size());
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					if (queue.peek() - min > 0) {
						queue.offer(queue.peek() - min);
						queue.poll();

					} else
						queue.poll();
				}

			}

		}
		return list;

	}

}
