package com.cisco;

import com.cisco.node.LinkedList;
import com.cisco.node.Node;

public class MergeLinkLists {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		for (int i = 1; i < 1000; i++) {
			list.insertAtEnd(i);
		}

		System.out.println(list.traverseList());
		LinkedList list1 = new LinkedList();
		for (int i = 1000; i < 2000; i++) {
			list1.insertAtEnd(i);
		}

		Node head1 = mergeLinkedLists(list.getHead(), list1.getHead(), 3, 200);
		LinkedList list3 = new LinkedList();
		list3.setHead(head1);
		System.out.println(list3.traverseList());

	}

	public static Node mergeLinkedLists(Node head1, Node head2, int startPos,
			int endPos) {
		Node prev = null;
		Node curr = head1;
		if (startPos > 1) {
			for (int i = 1; i < startPos - 1; i++) {
				curr = curr.getNext();
			}
			prev = curr.getNext();
			curr.setNext(head2);
		} else {
			prev = curr;
			head1 = head2;
		}

		Node fastPointer = curr;
		while (fastPointer != null && fastPointer.getNext() != null) {

			if (fastPointer.getNext().getNext() != null)
				fastPointer = fastPointer.getNext().getNext();
			else
				fastPointer = fastPointer.getNext();
		}

		for (int i = startPos; i < endPos; i++) {
			prev = prev.getNext();
		}
		fastPointer.setNext(prev.getNext());

		return head1;
	}
}
