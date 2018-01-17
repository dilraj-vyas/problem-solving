package com.cisco.node;

import java.util.ArrayList
;
import java.util.List;


public class LinkedList {
	private Node head;
	private int length;

	public void insertAtBegin(int data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			newNode.setNext(head);
			head = newNode;
		}
		length++;

	}

	public void insertAtPosition(int data, int position) {

		Node newNode = new Node(data);
		Node currNode = head;

		if (currNode != null && length > position) {
			for (int pointer = 1; pointer < position - 1; pointer++) {
				currNode = currNode.getNext();
			}
			newNode.setNext(currNode.getNext());
			currNode.setNext(newNode);
		} else
			throw new ArrayIndexOutOfBoundsException("Element Can't Inserted");
		length++;
	}

	public List<Integer> traverseList() {
		Node currNode = head;
		List<Integer> list = new ArrayList<Integer>();
		if (head != null) {
			while (currNode != null) {
				list.add(currNode.getData());
				currNode = currNode.getNext();
			}

		}
		return list;
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		Node currNode = head;
		if (head == null)
			head = newNode;
		else {
			while (currNode.getNext() != null)
				currNode = currNode.getNext();
			currNode.setNext(newNode);
		}
		length++;
	}

	public int size() {
		return length;
	}
	
	

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		// list.insertAtBegin(10);
		// list.insertAtBegin(11);
		// list.insertAtBegin(12);
		// list.insertAtBegin(13);
		list.insertAtEnd(10);
		list.insertAtEnd(11);
		list.insertAtEnd(12);
		list.insertAtEnd(13);
		list.insertAtEnd(14);
		list.insertAtEnd(15);
		list.insertAtPosition(89, 7);
	}

}
