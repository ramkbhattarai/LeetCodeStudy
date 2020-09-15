package arrays;
/**
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

 

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
 

Constraints:

1 <= arr.length <= 10^4
1 <= arr[i] <= 10^5
 * @author ramkrishnabhattarai
 *
 */

public class ReplaceWIthMaximumOnRight {
	
	public void replace(int[] arr, int index, int length){
        for(int i = index +1; i < length; i++){
            if(i == length){
                arr[i-1] = -1;
            }else{
                arr[i -1] = arr[i];
            }
        }
    }
    public int[] replaceElements(int[] arr) {
        if(arr.length < 2) return arr;
        int op = 0;
        int maxCurrent = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(maxCurrent >= arr[i]){
                op++;
                continue;
            }else{
                if(op < arr.length){
                    replace(arr, i -1, arr.length);
                    op++;
                }

            }
        }
        return arr;
    }

}
