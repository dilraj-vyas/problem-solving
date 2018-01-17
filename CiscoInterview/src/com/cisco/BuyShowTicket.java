package com.cisco;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BuyShowTicket {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();

		list.add(new Person("", 1));
		list.add(new Person("", 1));
		list.add(new Person("", 1));
		list.add(new Person("", 1));

		list.get(0).setName("buy");

		Queue<Person> list1 = new LinkedList<Person>(list);
		System.out.println(getTime(list1));
	}

	public static int getTime(Queue<Person> list1) {
		int time = 0;
		while (!list1.isEmpty()) {
			Person curr = list1.poll();
			time++;
			if (curr.getTicketLeft() <= 1 && !curr.getName().isEmpty()) {
				break;
			} else if (curr.getTicketLeft() > 1 && !curr.getName().isEmpty()) {
				list1.offer(new Person(curr.getName(), curr.getTicketLeft() - 1));
			} else if (curr.getTicketLeft() > 1) {
				list1.offer(new Person("", curr.getTicketLeft() - 1));
			}

		}

		return time;
	}

	static long waitingTime(int[] tickets, int p) {
		Queue<Person> list1 = new LinkedList<Person>();
		for (int i = 0; i < tickets.length; i++) {
			if (i == p) {
				list1.offer(new Person("buy", tickets[i]));
			} else
				list1.offer(new Person("", tickets[i]));
		}
		long time = 0;
		while (!list1.isEmpty()) {
			Person curr = list1.poll();
			time++;
			if (curr.getTicketLeft() <= 1 && !curr.getName().isEmpty()) {
				break;
			} else if (curr.getTicketLeft() > 1 && !curr.getName().isEmpty()) {
				list1.offer(new Person(curr.getName(), curr.getTicketLeft() - 1));
			} else if (curr.getTicketLeft() > 1) {
				list1.offer(new Person("", curr.getTicketLeft() - 1));
			}

		}

		return time;
	}

}

class Person {
	private String name;
	private int ticketLeft;

	public Person(String name, int ticketLeft) {
		this.name = name;
		this.ticketLeft = ticketLeft;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTicketLeft() {
		return ticketLeft;
	}

	public void setTicketLeft(int ticketLeft) {
		this.ticketLeft = ticketLeft;
	}

}