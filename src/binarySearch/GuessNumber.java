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
	
    public  static int guessNumber(int n) {
        if(guess(n) == 0) return n;
        int low = 1;
        int high = n;
        int guess = 0;
        while(low <= high){
             guess = low + (high - low)/2;
            if(guess(guess) == 0) return guess;
            if(guess(guess) == 1){
                low = guess +1;
            }else{
                high = guess -1;
            }
        }
        // System.out.println(guess);
        return guess;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
