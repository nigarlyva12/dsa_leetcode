package leetcode;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray26 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
	}
	
	public static int removeDuplicates(int[] nums) {
		HashSet<Integer> s = new HashSet<>();
		
		int idx=0;
		
		for(int i=0; i<nums.length; i++) {
			if(!s.contains(nums[i])) {
				s.add(nums[i]);
				idx++;
				nums[idx] = nums[i];
			}
		
		}
		return idx;
	}
}
