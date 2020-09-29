package BinaryTree;

import java.util.ArrayList;
import java.util.List;

import BinaryTree.InorderTraversal.TreeNode;

public class PostOrderTraversal {
	
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
	 
	// recursive 
     public List<Integer> dfs(TreeNode root, List<Integer> list){
         if(root == null) return list;
         list = dfs(root.left, list);
         list = dfs(root.right, list);
         list.add(root.val);
         return list;
     }
     public List<Integer> postorderTraversal(TreeNode root) {
         return dfs(root, new ArrayList<Integer>());
     }

}
