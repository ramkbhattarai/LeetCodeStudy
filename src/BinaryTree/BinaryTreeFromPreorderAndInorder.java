package BinaryTree;

import BinaryTree.BuildBinaryTreeUsingInOrderAndPostOrder.TreeNode;

/**
 * Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given

preorder = [3,9,20,15,7]
inorder = [9,3,15,20,7]
Return the following binary tree:

    3
   / \
  9  20
    /  \
   15   7
 * @author ramkrishnabhattarai
 *
 */

public class BinaryTreeFromPreorderAndInorder {
	
	class TreeNode {
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
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        if(n == 0) return null;
        return makeBinaryTree(preorder, 0 , n , inorder, 0, n);
    }
    
        private TreeNode makeBinaryTree(int[] preorder, int p1, int p2, int[] inorder, int i1, int i2)       {
        if(i1 >= i2 || p1 >= p2) return null;
        
        TreeNode root = new TreeNode(preorder[p1]);
        
        int it = 0;
        for(int i =i1; i < i2; i++){
            if(preorder[p1] == inorder[i]){
                it = i;
                break;
            }
        }
        int diff = it -i1;
        root.left = makeBinaryTree(preorder, p1+1, p1+1+ diff,inorder, i1, i1+ diff);
        root.right = makeBinaryTree(preorder,p1+1+ diff,  p2,inorder, i1+diff + 1, i2);
        return root;
    }

}
