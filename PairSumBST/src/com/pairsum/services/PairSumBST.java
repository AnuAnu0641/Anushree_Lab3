package com.pairsum.services;

import java.util.HashSet;
import java.util.Set;

import com.pairsum.util.Node;

public class PairSumBST {

	public static boolean findPair(Node currentNode, int sum, Set<Integer> set) {
		if (currentNode == null)
			return false;
		else {
			boolean isPresent = findPair(currentNode.left, sum, set);
			if (isPresent)
				return isPresent;
			if (set.contains(sum - currentNode.data)) {
				System.out.println(
						"The pair exists with values of 	" + (sum - currentNode.data) + " , " + currentNode.data);
				return true;
			} else
				set.add(currentNode.data);
			return findPair(currentNode.right, sum, set);

		}
	}

	public static void findPairWithGivenSum(Node root, int sum) {

		HashSet<Integer> set = new HashSet<Integer>();
		boolean isPresent = findPair(root, sum, set);
		if (!isPresent)
			System.out.println("Pair does not exists");
		;
	}
}
