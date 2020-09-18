package arrays;
/**
 * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 * @author ramkrishnabhattarai
 *
 */
public class ThirdMaximum {
	
	public static int thirdMax(int[] nums) {
		double max1 = Double.NEGATIVE_INFINITY;
        double max2 = Double.NEGATIVE_INFINITY;
        double max3 = Double.NEGATIVE_INFINITY;
        if(nums.length < 2) return (int)max1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max1) max1 = nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max2 && nums[i] != max1){
              max2 = nums[i];  
            } 
        }
         for(int i = 0; i < nums.length; i++){
            if(nums[i] > max3 && nums[i] != max1 && nums[i] != max2){
              max3 = nums[i];  
            } 
        }
         if(max1 == max2 && max2 == max3){
             return (int)max1;  
           } 
           else if(max3 != Double.NEGATIVE_INFINITY){return (int)max3;}
           else {
           	return (int)max1;
           }
    }
	
	public static void main(String[] args) {
		System.out.println(thirdMax(new int[] {1,2,-2147483648})); //[1,2,-2147483648]
	}

}
