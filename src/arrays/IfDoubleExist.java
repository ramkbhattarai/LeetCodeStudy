package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 

Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
Example 2:

Input: arr = [7,1,14,11]
Output: true
Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
Example 3:

Input: arr = [3,1,7,11]
Output: false
Explanation: In this case does not exist N and M, such that N = 2 * M.
 

Constraints:

2 <= arr.length <= 500
-10^3 <= arr[i] <= 10^3
 * @author ramkrishnabhattarai
 *
 */

public class IfDoubleExist {
	
	
    public static boolean checkIfExist(int[] arr) {
    	 if(arr == null || arr.length < 2) return false;
         Map<Double, Integer> map = new HashMap<>();
         for(int i = 0; i < arr.length; i++){
               if(map.containsKey(2.0 * arr[i])|| map.containsKey(arr[i]/2.0)) return true;  
             map.put(arr[i]/1.0, i);
         }
         return false;
    }

	public static void main(String[] args) {
	System.out.println(checkIfExist(new int[] {909,121,-296,872,807,715,407,94,-8,572,90,-520,-867,485,-918,-827,-728,-653,-659,865,102,-564,-452,554,-320,229,36,722,-478,-247,-307,-304,-767,-404,-519,776,933,236,596,954,464,817,1,-723,187,128,577,-787,-344,-920,-168,-851,-222,773,614,-699,696,-744}));// [7,1,14,11] 
	//[909,121,-296,872,807,715,407,94,-8,572,90,-520,-867,485,-918,-827,-728,-653,-659,865,102,-564,-452,554,-320,229,36,722,-478,-247,-307,-304,-767,-404,-519,776,933,236,596,954,464,817,1,-723,187,128,577,-787,-344,-920,-168,-851,-222,773,614,-699,696,-744]
//	System.out.println((7/1.0));
	}
	

}
