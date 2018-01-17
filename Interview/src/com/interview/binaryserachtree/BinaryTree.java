package com.interview.binaryserachtree;

public class BinaryTree {
	private Node root;
	private int lenght;

	public void insert(int data) {
		Node newNode = new Node(data);
		Node currNode = root;
		if (root != null) {
			while (currNode != null) {
				if (currNode.getData() > data) {
					if (currNode.getLeft() != null)
						currNode = currNode.getLeft();
					else {
						currNode.setLeft(newNode);
						break;
					}
				} else if (currNode.getData() < data) {
					if (currNode.getRight() != null)
						currNode = currNode.getRight();
					else {
						currNode.setRight(newNode);
						break;
					}
				}
			}
		} else {
			root = newNode;
		}
		lenght++;
	}

	public Node getRoot() {
		return root;
	}

	public int getLenght() {
		return lenght;
	}

	public void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.getData()+" ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.getLeft());
			System.out.print(root.getData()+" ");
			inOrder(root.getRight());
		}
	}

	public void postOrder(Node root) {
		if (root != null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData()+" ");
		}
	}

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

	}

}
