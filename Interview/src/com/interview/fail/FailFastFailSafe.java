package com.interview.fail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {

	public static List failFast() {
		List<String> list = new ArrayList<String>();
		list = createList(list);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			list.remove("B");
		}
		return list;
	}

	public static List failSafe() {
		List<String> list = new CopyOnWriteArrayList();
		list = createList(list);
		Iterator<String> itr = list.iterator();
		for (String string : list) {
			list.remove("B");
		}
		return list;
	}

	public static List<String> createList(List<String> list) {
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		return list;
	}

	public static void main(String[] args) {
		System.out.println(failFast());
		 System.out.println(failSafe());
	}

}
