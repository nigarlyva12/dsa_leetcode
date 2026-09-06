package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianOfTwoSortedArrays4 {
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        List<Integer> merged = new ArrayList<>();
			Integer[] res;
			for(int i=0; i<nums1.length; i++) {
				merged.add(nums1[i]);
			}
			for(int i=0; i<nums2.length; i++) {
				merged.add(nums2[i]);
			}
			res = merged.toArray(new Integer[0]);
			Arrays.sort(res);

	        if(res.length%2!=0) 
				return res[res.length/2];
			return (res[(res.length - 1) / 2] + res[res.length / 2]) / 2.0;
	    }
}
