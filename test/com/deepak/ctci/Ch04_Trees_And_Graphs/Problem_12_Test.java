/**
 * Cracking-The-Coding-Interview
 * Problem_12_Test.java
 */
package com.deepak.ctci.Ch04_Trees_And_Graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.ctci.Ch04_Trees_And_Graphs.Problem_12;
import com.deepak.ctci.Library.TreeNode;

/**
 * Test cases for Problem 12
 * 
 * @author Deepak
 */
public class Problem_12_Test {

	/* Root of the tree */
	private TreeNode<Integer> root;

	/**
	 * Setup to create a base tree
	 * 
	 * 			13
	 * 	  	  /    \
	 * 		 7		16
	 *	    / \    /  \
	 * 	   3   9  14  23
	 */
	@Before
	public void setup() {
		root = new TreeNode<Integer>(13);
		TreeNode<Integer> node2 = new TreeNode<Integer>(7);
		TreeNode<Integer> node3 = new TreeNode<Integer>(16);
		TreeNode<Integer> node4 = new TreeNode<Integer>(3);
		TreeNode<Integer> node5 = new TreeNode<Integer>(9);
		TreeNode<Integer> node6 = new TreeNode<Integer>(14);
		TreeNode<Integer> node7 = new TreeNode<Integer>(23);

		/* Setup Tree */
		root.left = node2;
		root.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
	}

	/**
	 * Test cases to count paths with sum
	 */
	@Test
	public void testCountPathsWithSum() {
		Assert.assertEquals(Problem_12.countPathsWithSum(root, 29), 2);
		Assert.assertEquals(Problem_12.countPathsWithSum(null, 29), 0);
		Assert.assertEquals(Problem_12.countPathsWithSum(root, 0), 0);
	}

}
