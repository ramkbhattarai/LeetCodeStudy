package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
     
     // iterative solution with 2 stacks
     public List<Integer> postorderTraversal2(TreeNode root) {
         List<Integer> list = new ArrayList<Integer>();
         if(root == null) return list;
         
         Stack<TreeNode> stack1 = new Stack<TreeNode>();
         Stack<TreeNode> stack2 = new Stack<TreeNode>();
         stack1.push(root);
         while(!stack1.empty()){
            TreeNode node = stack1.pop();
             stack2.push(node);
             if(node.left != null){
                 stack1.push(node.left);
             }
             if(node.right != null){
                 stack1.push(node.right);
             }
         }

          while(!stack2.empty()){
            TreeNode node = stack2.pop();
             list.add(node.val);
         }

         return list;
     }

}
