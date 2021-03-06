package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import BinaryTree.PreOrderTraversal.TreeNode;

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
Example 4:


Input: root = [1,2]
Output: [2,1]
Example 5:


Input: root = [1,null,2]
Output: [1,2]
 

Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 

Follow up:

Recursive solution is trivial, could you do it iteratively?
 * @author ramkrishnabhattarai
 *
 */
public class InorderTraversal {
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
        list.add(root.val);
        return dfs(root.right, list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        return dfs(root, new ArrayList<Integer>());
    }
    
    // iterative solution
    
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return list;
        TreeNode curr = root;
        while(!stack.empty() || curr != null){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }

}
