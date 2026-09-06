package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] arr1 = {3,1};
		int[] arr2 = {2,6,3};
		
		Integer res[] = mergeArrays(arr1, arr2);
		
		for(int el : res) {
			System.out.print(el + " ");
		}
		
	}
	
	public static Integer[] mergeArrays(int[] arr1, int[] arr2) {
		List<Integer> merged = new ArrayList<>();
		Integer[] res;
		for(int i=0; i<arr1.length; i++) {
			merged.add(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++) {
			merged.add(arr2[i]);
		}
		res = merged.toArray(new Integer[0]);
		Arrays.sort(res);
		return res;
	}
	public static double findMedian(Integer arr[]) {
		int n = arr.length;
		
		if(n%2!=0) 
			return arr[n/2];
		return (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
	}
}
