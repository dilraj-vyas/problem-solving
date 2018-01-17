package com.cisco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HackLandElection {
	public static void main(String[] args) {
		// List<Candidate> list = new ArrayList<Candidate>();
		// list.add(new Candidate("Alex", 2));
		// list.add(new Candidate("Michael", 2));
		// list.add(new Candidate("Harry", 2));
		// // list.add(new Candidate("Victor",3));
		// list.add(new Candidate("Mary", 2));
		// list.add(new Candidate("Dave",5));

		String str[] = { "Alex", "Michael", "Harry", "Dave", "Michael",
				"Victor", "Harry", "Alex", "Mary", "Mary" };
		// Collections.sort(list, new SortByNameAndVotes());
		
		System.out.println(electionWinner(str));
	}

	public static String electionWinner(String[] votes) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < votes.length; i++) {
			if (map.get(votes[i]) != null)
				map.put(votes[i], map.get(votes[i]) + 1);
			else
				map.put(votes[i], 1);
		}
		Set<Entry<String, Integer>> set = map.entrySet();

		List<Entry<String, Integer>> list1 = new ArrayList<Map.Entry<String, Integer>>(
				set);


		Collections.sort(list1, new SortByNameAndVotes());
		
		return list1.get(0).getKey();
	}

	static class  SortByNameAndVotes implements Comparator<Map.Entry<String, Integer>> {

		@Override
		public int compare(Map.Entry<String, Integer> c1, Map.Entry<String, Integer> c2) {
			if (c2.getValue().equals(c1.getValue()))
				return c2.getKey().compareTo(c1.getKey());
			else
				return c2.getValue().compareTo(c1.getValue());
		}

		// @Override
		// public int compare(Candidate c1, Candidate c2) {
		// if (c1.values().equals(c2.votes)) {
		// return c2.name.compareTo(c1.name);
		// } else
		// return c2.votes.compareTo(c1.votes);
		// }

	}
	
}

class Candidate {
	String name;
	Integer votes;

	public Candidate(String name, int votes) {
		this.name = name;
		this.votes = votes;

	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", votes=" + votes + "]";
	}

}


