package arrays;
/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

 

Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
 

Note:

1 <= arr.length <= 10000
0 <= arr[i] <= 9
 * @author ramkrishnabhattarai
 *
 */
public class DuplicateZeros {
	
	public static void shift(int[]arr,int j,int length){
        for(int i = length; i >= j; i--){
            arr[i+1] = arr[i];
        }
        arr[j] = 0;
    }
    public static void duplicateZeros(int[] arr) {
        for(int i = 0; i< arr.length -1;i++){
            if(arr[i] == 0){
                shift(arr, i+1, arr.length -2);
                i+=1;
            }
            
        }
        
        
    }

	public static void main(String[] args) {
		duplicateZeros(new int[] {0,4,1,0,0,8,0,0,3}); //[0,0,4,1,0,0,0,0,8]

	}

}
