package BinaryTree;

import BinaryTree.SymmetricTree.TreeNode;

public class BuildBinaryTreeUsingInOrderAndPostOrder {
	
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
	
	// a good approach but have to figure out the methods to filter the components of array.
//	public int getIndex(int[] arr, int val){
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == val) return i;
//        }
//        return -1;
//    }
//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        if(inorder.length == 0 && postorder.length == 0) return null;
//        int rootVal = inorder[1];
//        TreeNode root = new TreeNode(rootVal);
//        int midIndex = getIndex(inorder, rootVal);
//        
//        int[] leftInorder = Arrays.copyOfRange(inorder, 0, midIndex);
//        int[] rightInorder = Arrays.copyOfRange(inorder,midIndex+1, inorder.length);
//        
//        int[] leftPostOrder = Arrays.stream(postorder)
//                                    .filter((i) -> IntStream.of(postorder).anyMatch(x -> x == i))
//                                    .toArray(Integer[]::new);
//        int[] rightPostOrder = Arrays.stream(postorder)
//                                    .filter((i) -> IntStream.of(postorder).anyMatch(x -> x == i))
//                                    .toArray(Integer[]::new);
//        TreeNode left = buildTree(leftInorder,leftPostOrder);
//        TreeNode right = buildTree(rightInorder,rightPostOrder);
//        root.left = left;
//        root.right = right;
//        return root;
//    }

	

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length != postorder.length) return null;
        return makeBinaryTree(inorder, postorder,0, inorder.length -1 ,postorder.length -1);
    }
    
    private TreeNode makeBinaryTree(int[] inorder, int[] postorder, int start, int end, int index){
        if(start > end) return null;
        
        TreeNode root = new TreeNode(postorder[index]);
        
        int i = 0;
        while(inorder[end-i] != postorder[index]){
            i++;
        }
        
        root.left = makeBinaryTree(inorder, postorder, start, end -i-1, index -i-1);
        root.right = makeBinaryTree(inorder, postorder, end -i+1, end, index-1);
        return root;
    }
}
