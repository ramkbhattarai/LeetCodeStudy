package binarySearch;
/**
 * We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
Example :

Input: n = 10, pick = 6
Output: 6
 * @author ramkrishnabhattarai
 *
 */

public class GuessNumber {
	
//    public  static int guessNumber(int n) {
//        if(guess(n) == 0) return n;
//        int low = 1;
//        int high = n;
//        int guess = 0;
//        while(low <= high){
//             guess = low + (high - low)/2;
//            if(guess(guess) == 0) return guess;
//            if(guess(guess) == 1){
//                low = guess +1;
//            }else{
//                high = guess -1;
//            }
//        }
//        // System.out.println(guess);
//        return guess;
//    }
    
    
    /**
     * In Binary Search, we choose the middle element as the pivot in splitting. 
     * In Ternary Search, we choose two pivots (say m1m1 and m2m2) such that the given range is divided into three equal parts.
     *  If the required number numnum is less than m1m1 then we apply ternary search on the left segment of m1m1. 
     *  If numnum lies between m1m1 and m2m2, we apply ternary search between m1m1 and m2m2.
     *   Otherwise we will search in the segment right to m2m2.
     * @param n
     * @return
     */
    
    public int guessNumber2(int n) {
//        int low = 1;
//        int high = n;
//        while (low <= high) {
//            int mid1 = low + (high - low) / 3;
//            int mid2 = high - (high - low) / 3;
//            int res1 = guess(mid1);
//            int res2 = guess(mid2);
//            if (res1 == 0)
//                return mid1;
//            if (res2 == 0)
//                return mid2;
//            else if (res1 < 0)
//                high = mid1 - 1;
//            else if (res2 > 0)
//                low = mid2 + 1;
//            else {
//                low = mid1 + 1;
//                high = mid2 - 1;
//            }
//        }
        return -1;
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
