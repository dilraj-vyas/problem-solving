package com.cisco;

import com.cisco.node.LinkedList;
import com.cisco.node.Node;

public class DeleteNode {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtEnd(10);
		list.insertAtEnd(11);
		list.insertAtEnd(12);
		list.insertAtEnd(13);
		list.insertAtEnd(14);
		list.insertAtEnd(15);
		list.insertAtEnd(21);
		list.insertAtEnd(22);
		list.insertAtEnd(8);
		list.insertAtEnd(16);
		list.insertAtEnd(2);

		System.out.println(list.traverseList());
		// list.setHead(mergeLists(list.getHead(), 14));
		list.setHead(removeNodes1(list.getHead(), 14));
		System.out.println(list.traverseList());
	}

	public static Node mergeLists(Node list, int x) {

		Node prev = list;
		Node head = prev;
		while (list != null && list.getData() > x) {
			head = prev.getNext();
			prev = head;
			list = head;
		}

		while (list != null) {
			while (list != null && list.getData() <= x) {
				prev = list;
				list = list.getNext();
			}

			if (list == null)
				return head;

			prev.setNext(list.getNext());
			list = prev.getNext();
		}
		return head;
	}

	public static Node removeNodes1(Node list, int x) {
		Node currNode = list;
		LinkedList newList = new LinkedList();
		while (currNode != null) {
			if (currNode.getData() <= x) {
				newList.insertAtEnd(currNode.getData());
			}
			currNode = currNode.getNext();
		}

		return newList.getHead();
	}

}
