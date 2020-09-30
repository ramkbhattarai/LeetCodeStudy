package BinaryTree;

import BinaryTree.LevelOrderTraversal.TreeNode;

/**
 * Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
 * @author ramkrishnabhattarai
 *
 */
public class MaximumDepthOfBinaryTree {
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	
	// bottom-up recursive approach
	public int maxDepth(TreeNode root) {
        if (root == null) {
		    return 0;                                   
	    }
	    int left_depth = maxDepth(root.left);
	    int right_depth = maxDepth(root.right);
	    return Math.max(left_depth, right_depth) + 1;
    }
	
	

	// top-down approach
	private int answer;		// don't forget to initialize answer before call maximum_depth
	private void maximum_depth(TreeNode root, int depth) {
	    if (root == null) {
	        return;
	    }
	    if (root.left == null && root.right == null) {
	        answer = Math.max(answer, depth);
	    }
	    maximum_depth(root.left, depth + 1);
	    maximum_depth(root.right, depth + 1);
	}
	
	


}
