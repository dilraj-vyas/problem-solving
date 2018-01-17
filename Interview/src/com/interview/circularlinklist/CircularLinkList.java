package com.interview.circularlinklist;

import com.interview.Node;

public class CircularLinkList {
	private Node tail;
	private int lenght;

	public static void main(String[] args) {

		CircularLinkList list = new CircularLinkList();
		list.insertAtBegin(6);
		list.insertAtBegin(7);
		list.insertAtBegin(8);
		list.insertAtBegin(9);
		list.insertAtBegin(10);
		list.traverseList();
	}

	public void insertAtBegin(int data) {
		Node newNode = new Node(data);
		if (tail != null) {
			newNode.setNext(tail.getNext());
			tail.setNext(newNode);
		} else {
			tail = newNode;
			tail.setNext(tail);
		}
	}

	public void traverseList() {
		Node currNode = tail.getNext();

		while (currNode != null && currNode != tail) {
			System.out.println(currNode.getData());
			currNode = currNode.getNext();

		}
		System.out.println(currNode.getData());

	}

	
	
}
