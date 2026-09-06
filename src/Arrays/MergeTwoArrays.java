package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] arr1 = {1,3};
		int[] arr2 = {2};
		
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
		return res;
	}
}
