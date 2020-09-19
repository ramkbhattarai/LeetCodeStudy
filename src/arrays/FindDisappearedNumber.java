package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
   Hide Hint #1  
This is a really easy problem if you decide to use additional memory. For those trying to write an initial solution using additional memory, think counters!
   Hide Hint #2  
However, the trick really is to not use any additional space than what is already available to use. Sometimes, multiple passes over the input array help find the solution. However, there's an interesting piece of information in this problem that makes it easy to re-use the input array itself for the solution.
   Hide Hint #3  
The problem specifies that the numbers in the array will be in the range [1, n] where n is the number of elements in the array. Can we use this information and modify the array in-place somehow to find what we need?
 * @author ramkrishnabhattarai
 *
 */

public class FindDisappearedNumber {
	
  // idea is to change the value of the indices of the numbers that are in nums to negative. we take absolute value becuase we 
	// want to make sure that the value becomes negative and this might not happen because the values get repeated.
	// once we make all the values negative we loop through the array once more and check in any value in the indices is positive.
	// if it is positive we return the index +1 because the values in array start with 1 and indices start with 0.
    public static List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int currentValue = Math.abs(nums[i]); // we want to take the positive value only
            nums[currentValue -1] = - (Math.abs(nums[currentValue -1]));
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                list.add(i + 1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
		findDisappearedNumbers(new int[] {3,11,8,16,4,15,4,17,14,14,6,6,2,8,3,12,15,20,20,5}); //[1,7,9,10,13,18,19]
	}

}
