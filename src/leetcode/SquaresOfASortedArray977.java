package leetcode;

public class SquaresOfASortedArray977 {
	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		int[] res = sortedSquares(nums);
		
		for(int el : res) {
			System.out.print(el + " ");
		}
	}
	//version 1
	public static int[] sortedSquares(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int) Math.pow(nums[i], 2);
		}
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length-1; j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		return nums;
	}
	//version 2 O(n) time complexity
	
	public static int[] sortedSquaresV2(int[] nums) {
		int left = 0;
		int right = nums.length-1;
		int[] result = new int[nums.length];
		int pos = nums.length-1;
		
		while(left<=right) {
			int leftSquare = nums[left]*nums[left];
			int rightSquare = nums[right] * nums[right];
			
			if(leftSquare>rightSquare) {
				result[pos] = leftSquare;
				left++;
			}else {
				result[pos]=rightSquare;
				right--;
			}
			pos--;
		}
		return result;
	}
}
