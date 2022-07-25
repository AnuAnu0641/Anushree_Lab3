package com.pairsum.driver;

import com.pairsum.services.PairSumBST;
import com.pairsum.util.InsertNode;
import com.pairsum.util.Node;


public class MainClass {
	
	public static void main(String[] args) {
		Node root = null;
		InsertNode pairsum = new InsertNode();
		root = pairsum.insert(root, 40);
		root = pairsum.insert(root, 20);
		root = pairsum.insert(root, 60);
		root = pairsum.insert(root, 10);
		root = pairsum.insert(root, 30);
		root = pairsum.insert(root, 50);
		root = pairsum.insert(root, 70);
		PairSumBST.findPairWithGivenSum(root,30);
	}
}
