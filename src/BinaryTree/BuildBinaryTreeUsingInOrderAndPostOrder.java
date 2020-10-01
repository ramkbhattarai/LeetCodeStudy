package BinaryTree;

public class BuildBinaryTreeUsingInOrderAndPostOrder {
	
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

}
