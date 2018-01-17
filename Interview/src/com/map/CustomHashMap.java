package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.interview.linklistimplementation.LinkedList;

public class CustomHashMap {
	Node[] map = new Node[10];

	public static void main(String[] args) {
	}

	public boolean put(String key, String value) {
		boolean flag = false;
		Node newNode = new Node(key.hashCode(), key, value, null);

		if (map[getIndex(key)] != null) {

			map[getIndex(key)].setNext(newNode);

		} else
			map[getIndex(key)] = newNode;

		return flag;
	}

	public int getIndex(String key) {

		return key.hashCode() & map.length - 1;
	}

	class Node<K, V> {

		private int hashCode;
		private String key;
		private String value;
		private Node<K, V> next;

		public Node() {
			// TODO Auto-generated constructor stub
		}

		public Node(int hashcode, String key, String value, Node next) {
			this.hashCode = hashcode;
			this.key = key;
			this.value = value;
			this.next = next;
		}

		public int getHashCode() {
			return hashCode;
		}

		public void setHashCode(int hashCode) {
			this.hashCode = hashCode;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
