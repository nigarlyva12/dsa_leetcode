package leetcode;

public class SortColors75 {
	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		
		for(int el : nums) {
			System.out.print(el+" ");
		}
	}
	public static void sortColors(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length-1; j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
}
