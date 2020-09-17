package arrays;
/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 * @author ramkrishnabhattarai
 *
 */

public class MoveZeros {

	public void swap(int[] nums, int i, int j){
		int temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
	}
	public void moveZeroes(int[] nums) {
		int writer = 0;
		for(int reader = 0; reader < nums.length; reader++){
			if(nums[reader] != 0){
				swap(nums, reader, writer);
				writer++;
			}
		}
	}

}
