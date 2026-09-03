package leetcode;

public class SumOfSquaresOfSpecialElements {
	public static void main(String[] args) {
		int[] nums = {2,7,1,19,18,3};
		System.out.println(sumOfSquares(nums));
	}
	
	public static int sumOfSquares(int[] nums) {
		 int sum=0;
			int n = nums.length;

			for(int i=1; i<=n; i++) {
				if(n%i==0) {
					sum+=Math.pow(nums[i-1], 2);
				}
			}
			return sum;
	}
}
