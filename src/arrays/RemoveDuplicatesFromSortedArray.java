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
//		System.out.println("removed index = "+ index);
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

	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] {0,0,0,0,1,2,3,3,3,4}));//[1,2] [0,0,1,1,1,2,2,3,3,4] [0,0,0,0,1,2,3,3,3,4]
	}

}
