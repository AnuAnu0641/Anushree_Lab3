package com.pairsum.util;

public class InsertNode {
	
	public Node insert(Node root, int key) {
		Node newNode = new Node(key);
		if (root == null) {
			root = newNode;
			return root;
		}
		if (key < root.data)
			root.left = insert(root.left, key);
		else
			root.right = insert(root.right, key);
		return root;
	}
}
