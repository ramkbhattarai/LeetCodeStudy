package arrays;
/**
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

 

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 

Note:

1 <= A.length <= 5000
0 <= A[i] <= 5000
 * @author ramkrishnabhattarai
 *
 */

public class SortByParity {
	public void swap(int[] nums, int i, int j){
		int temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
	}
    public int[] sortArrayByParity(int[] A) {
        int writer = 0;
        for(int reader = 0; reader < A.length; reader++){
            if(A[reader] % 2 == 0){
                swap(A, reader, writer);
                writer++;
            }
        }
        return A;
    }
}
