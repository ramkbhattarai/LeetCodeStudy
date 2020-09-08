package arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
	
	public static int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++){
            A[i] = A[i] * A[i];
        }
       Arrays.sort(A);
      return A;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sortedSquares(new int[] {-4,-1,0,3,10})); //[0,1,9,16,100]
	}

}
