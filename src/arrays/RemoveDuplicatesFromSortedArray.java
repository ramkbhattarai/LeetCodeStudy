package arrays;
/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
 * @author ramkrishnabhattarai
 *
 */

public class RemoveDuplicatesFromSortedArray {
	public static void remove(int[] nums, int index, int length){ 
		for(int i = index +1; i < length; i++){
			nums[i -1] = nums[i];
		}
	}

	public static int count(int[] nums, int val) {
		int count = 0;
		for(int i : nums) {
			if(i == val) count++;
		}
		return count;
	}

	public static int removeDuplicates(int[] nums) {
		int capacity = nums.length;
		if(capacity < 1) return 0;
		if(capacity == 1) return 1;
        int po = 0;
        int pu = 0;
       for(int i = 0; po < capacity; i++) {
			int val = nums[i];
			int count = count(nums, val);
				if(count > 1) {
					for(int j=0; j < count -1 && po < capacity; j++) {
						remove(nums, i, capacity);
						po++;
					}
					pu++;
				}else{
            
                    pu++;
                }
           po++;    
		}
		return pu;
	}
	 
	
	// approach 2 
	public int removeDuplicates2(int[] nums) {

		// The initial length is simply the capacity.
		int length = nums.length;

		// Assume the last element is always unique.
		// Then for each element, delete it iff it is
		// the same as the one after it. Use our deletion
		// algorithm for deleting from any index.
		for (int i = length - 2; i >= 0; i--) {
			if (nums[i] == nums[i + 1]) {
				// Delete the element at index i, using our standard
				// deletion algorithm we learned.
				for (int j = i + 1; j < length; j++) {
					nums[j - 1] = nums[j];
				}
				// Reduce the length by 1.
				length--;
			}
		}
		// Return the new length.
		return length;
	} 
	
	
	// approach 3
	
	public int[] copyWithRemovedDuplicates(int[] nums) {
        
		  // Check for edge cases.
		  if (nums == null || nums.length == 0) {
		      return nums;
		  }

		  // Count how many unique elements are in the Array.
		  int uniqueNumbers = 0;
		  for (int i = 0; i < nums.length; i++) {
		      // An element should be counted as unique if it's the first
		      // element in the Array, or is different to the one before it.
		      if (i == 0 || nums[i] != nums[i - 1]) {
		          uniqueNumbers++;
		      }
		  }

		  // Create a result Array.
		  int[] result = new int[uniqueNumbers];

		  // Write the unique elements into the result Array.
		  int positionInResult = 0;
		  for (int i = 0; i < nums.length; i++) {
		    // Same condition as in the previous loop. Except this time, we can write
		    // each unique number into the result Array instead of just counting them.
		      if (i == 0 || nums[i] != nums[i - 1]) {
		          result[positionInResult] = nums[i];
		          positionInResult++;
		      }
		  }
		  return result;
		}

	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] {0,0,0,0,1,2,3,3,3,4}));//[1,2] [0,0,1,1,1,2,2,3,3,4] [0,0,0,0,1,2,3,3,3,4]
	}

}
