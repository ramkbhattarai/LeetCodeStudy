package arrays;
/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example 1:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,1,2,2,3,0,4,2], val = 2,

Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.

Note that the order of those five elements can be arbitrary.

It doesn't matter what values are set beyond the returned length.
Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeElement(nums, val);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
 * @author ramkrishnabhattarai
 *
 */

public class RemoveElement {
	
    public static void remove(int[] nums, int index, int length){    	
            for(int i = index +1; i < length; i++){
                nums[i -1] = nums[i];
            }
    }
    public static int indexOf(int[]nums, int val){
        for(int i = 0; i < nums.length; i++){
            if( nums[i] == val) return i;
        }
        return -1;
    }
    
    public static int count(int[]nums, int val){
        int count = 0;
       for(int i : nums){
           if(i == val) count++;
       }
        return count;
        
    }
    public static int removeElement(int[] nums, int val) { 
    	int count = count(nums, val);
        int capacity = nums.length;
        if(count == 0) return capacity;
        int len = capacity - count;
        int index = 0;
        int length = capacity;
        for(int i = 0; i <= len; i++){
             index = indexOf(nums, val);
            if(indexOf(nums,val) != -1) {            	
            	remove(nums, index, length);
                length--;
            }   
        }
        return len;
    }

	public static void main(String[] args) {

	int x = removeElement(new int[] {2,2,3}, 2); //[2,2]  [0,1,2,2,3,0,4,2]

	System.out.println(x);
	

	}

}
