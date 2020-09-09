package arrays;
/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 

Constraints:

-10^9 <= nums1[i], nums2[i] <= 10^9
nums1.length == m + n
nums2.length == n
 */

import java.util.Arrays;

public class MergeSortedArray {


	public static  void merge(int[] nums1, int m, int[] nums2, int n) {
		 int x = nums1.length;
	        
	        if(nums2.length != 0){
	        if(nums1.length > nums2.length) {
	            for(int i =0; i< n;i++){
	            nums1[i+m] = nums2[i];
	            
	            }
	        }else {
	            for(int i =0; i< x;i++){
	                if(nums1[i] == 0){
	                    nums1[i] = nums2[i];
	                }
	             }
	        }
	        }
	         
	        
	       
	       Arrays.sort(nums1); 
	}

	public static void main(String[] args) {
		merge(new int[] {1,2,3,0,0,0},3, new int[] {2,5,6},3);

	}

}
