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
	
	public static void replace(int[] arr, int index, int length){
        for(int i = index +1; i <= length; i++){
            if(i == arr.length){
                arr[i-1] = -1;
            }else{
                arr[i -1] = arr[i];
            }
        }
    }
    public static int[] replaceElements(int[] arr) {
    	 if(arr.length < 2) return new int[] {-1};
         int curEle = arr[arr.length -1];
         for(int i = arr.length -2; i >=0; i--){
             if(curEle > arr[i]){
                 arr[i] = curEle;
             }else {
            	 curEle = arr[i];
             }
            
             if(i == 0){
                 replace(arr, i, arr.length);
             }
         }
         return arr;
    }
    
    public static void main(String[] args) {
		replaceElements(new int[] {17,18,5,4,6,1});
	}

}
