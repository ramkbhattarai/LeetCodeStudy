package binarySearch;
/**
 * You are given an integer array nums sorted in ascending order, and an integer target.

Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

If target is found in the array return its index, otherwise, return -1.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 

Constraints:

1 <= nums.length <= 5000
-10^4 <= nums[i] <= 10^4
All values of nums are unique.
nums is guranteed to be rotated at some pivot.
-10^4 <= target <= 10^4
 * @author ramkrishnabhattarai
 *
 */

public class SearchInRotatedArray {
	
	public int search(int[] nums, int target) {
        if(nums == null || nums.length < 1) return -1;
        int low = 0;
        int high = nums.length -1;
        while(low < high){
            int midIndex = low + (high -low)/2;
            if(target == nums[midIndex]) return midIndex;
            if(nums[low] <= nums[midIndex]){
                if(nums[low] <= target && nums[midIndex] >= target){
                    high = midIndex -1;
                }else{
                    low = midIndex + 1;
                }
            }else{
                if(nums[midIndex] <= target && nums[high] >= target){
                    low = midIndex +1;
                }else{
                    high = midIndex -1;
                }
            }
        }
      return  nums[low] == target ? low : -1;
    }

}
