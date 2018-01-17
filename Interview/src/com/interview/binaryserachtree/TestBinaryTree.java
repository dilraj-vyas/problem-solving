package com.interview.binaryserachtree;

public class TestBinaryTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(10);
		tree.insert(8);
		tree.insert(12);
		tree.insert(6);
		tree.insert(9);
		tree.insert(11);
		tree.insert(14);
		tree.preOrder(tree.getRoot());
		tree.inOrder(tree.getRoot());
		tree.postOrder(tree.getRoot());
	}

}
