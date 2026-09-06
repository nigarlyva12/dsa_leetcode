package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class RemoveAnElementFromAnArray {
	public static void main(String[] args) {
		int[] arr = {5,3,1,2};
		//removing index 0
		int[] res = removeElementFromBeginning(arr);
		for(int el : res) {
			System.out.print(el + " ");
		}
		System.out.println("\n--------------------");
		//removing last element
		int[] res1 = removeElementEnd(arr);
		for(int el : res1) {
			System.out.print(el + " ");
		}
		System.out.println("\n--------------------");
		//removing random element
		Integer[] arr1 = {5,3,1,2};
		Integer target = 3;
		Integer[] res2 = removingRandomElement(arr1, target);
		
		for(int el : res2) {
			System.out.print(el + " ");
		}
		
		System.out.println("\n--------------------");
		//removing random element using LinkedHashSets
		Integer arr2[] = {5,3,1,2};
		int target2 = 3;
		
		Integer res3[] = removingRandomElementUsingHashSet(arr2, target2);
		
		for(Integer el : res3) {
			System.out.print(el +" ");
		}
	}
	
	public static int[] removeElementFromBeginning(int[] arr) {
		int[] newArr = new int[arr.length-1];
		
		for(int i=1; i<arr.length; i++) {
			newArr[i-1]=arr[i];
		}
		return newArr;
	}
	
	public static int[] removeElementEnd(int[] arr) {
		int[] newArr = new int[arr.length-1];
		
		for(int i=0; i<arr.length-1; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}
	
	public static Integer[] removingRandomElement(Integer arr[], Integer target) {
		List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
		if(!arrayList.contains(target)) {
			throw new NoSuchElementException("target not found");
		}else {
			arrayList.remove(target);
		}
		arr = arrayList.toArray(new Integer[0]);
		return arr;
	}
	
	public static Integer[] removingRandomElementUsingHashSet(Integer arr[], int target) {
		Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
		
		for(int i=0; i<arr.length; i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}
		}
		
		if(!set.contains(target)) throw new NoSuchElementException("target not found");
		set.remove(target);
		arr = set.toArray(new Integer[0]);	
		
		return arr;
	}
}
