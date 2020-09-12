package arrays;
/**
 * Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]


 

Example 1:

Input: [2,1]
Output: false
Example 2:

Input: [3,5,5]
Output: false
Example 3:

Input: [0,3,2,1]
Output: true
 * @author ramkrishnabhattarai
 *
 */

public class ValidMountain {
	
	public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > max) max = i;
        }
        return max;
    }
    
    public static int findIndexOfPeak(int[] arr, int val){
        for(int i =0; i< arr.length; i++){
            if(val == arr[i]) return i;
        }
        return -1;
    }
    public static boolean validMountainArray(int[] A) {
        if(A == null || A.length < 2) return false;
        int peak = max(A);
        int index = findIndexOfPeak(A, peak);
        if(index == 0) return false;
        if(index == A.length -1) return false;
        boolean check = true;
        boolean check2 = true;
        for(int i =0; i < index; i++){
            if(A[i] >= A[i+1]){
                check = false;
            }
        }
         for(int i =index; i < A.length -1; i++){
            if(A[i] <= A[i+1]){
                check2 = false;
            }
            
        }
        return check && check2;
    }
    

	public static void main(String[] args) {
		System.out.println(validMountainArray(new int[] {0,3,2,1}));//[0,3,2,1]

	}

}
