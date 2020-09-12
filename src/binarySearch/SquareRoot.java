package binarySearch;

public class SquareRoot {
	
	 public static int mySqrt(int x) {
	        double ans = x * 1.0;
	        double esp = 1e-15;
	        while(Math.abs(ans - (x / ans)) > esp * ans){
	            ans = (x/ans + ans)/2.0;
	        }
	        return (int) ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(81));
	}

}
