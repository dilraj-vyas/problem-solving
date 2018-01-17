package com.interview.linklist.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.interview.Node;
import com.interview.linklistimplementation.LinkedList;

public class RemoveDuplicateElement {

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

	public void removeDuplicateValue() {
		Node currNode = head;
		Node prev = null;

		Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();

		if (currNode != null) {
			prev = currNode;
			while (currNode != null) {
				if (tempMap.get(currNode.getData()) != null) {
					prev.setNext(currNode.getNext());
				} else {

					tempMap.put(currNode.getData(), currNode.getData());
					prev = currNode;
				}
				currNode = currNode.getNext();
			}

		}

	}

	public static void main(String[] args) {

		RemoveDuplicateElement list = new RemoveDuplicateElement();
		list.insertAtBegin(10);
		list.insertAtBegin(11);
		list.insertAtBegin(12);
		list.insertAtBegin(13);
		list.insertAtEnd(10);
		list.insertAtEnd(11);
		list.insertAtEnd(12);
		list.insertAtEnd(13);
		list.insertAtEnd(14);
		list.insertAtEnd(15);
		list.insertAtPosition(89, 7);
		System.out.println(list.traverseList());

		list.removeDuplicateValue();
		System.out.println(list.traverseList());
	}

}
