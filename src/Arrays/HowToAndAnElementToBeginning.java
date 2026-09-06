package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowToAndAnElementToBeginning {
	public static void main(String[] args) {
		int[] arr = {5,3,1,2};
		int[] res = addElementToBeginning(arr, 6);
		
		for(int el : res) {
			System.out.print(el+" ");
		}
		Integer[] arr2 = {5,3,1,2};
		Integer[] res2 = addElementToBeginningUsingArrayList(arr2, 6);
		System.out.println("");
		for(int el : res2) {
			System.out.print(el+" ");
		}
	}
	
	public static int[] addElementToBeginning(int[] arr, int value) {
		int[] newArr = new int[arr.length+1];
		newArr[0]=value;
		for(int i=0; i<arr.length; i++) {
			newArr[i+1] = arr[i];
		}
		return newArr;
	}
	
	public static Integer[] addElementToBeginningUsingArrayList(Integer arr[], int value) {
		List<Integer> newArr = new ArrayList<Integer>(Arrays.asList(arr));
		newArr.add(0, value);
		arr= newArr.toArray(arr);
		return arr;
	}
}
