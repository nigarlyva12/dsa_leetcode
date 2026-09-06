package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * two ways to add an element to the end of an array
 * 1. By creating a new array whose size is one greater than the original array - option 1
 * 2. By applying ArrayList
 * **/
public class HowToAddAnElementToEnd {
	public static void main(String[] args) {
		System.out.println("Adding a new element to the end of array");
		int[] arr = {3,4,6,10,1};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an element you want to add: ");
		int value = scan.nextInt();
		System.out.println("Option 1: ");
		int[] res = addElementByCreatingNewArray(arr, value);
		
		for(int el : res) {
			System.out.print(el+" ");
		}
		System.out.println("\nOption 2: ");
		Integer[] arr2 = {3,4,6,10,1};
		
		Integer[] res2 = addElementByUsingArrayList(arr2, value);
		for(int el : res2) {
			System.out.print(el+" ");
		}
	}
	//option 1
	public static int[] addElementByCreatingNewArray(int[] arr, int value) {
		int[] newarr = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			newarr[i] = arr[i];
		}
		newarr[newarr.length-1]=value;
		return newarr;
	}
	//option 2
	public static Integer[] addElementByUsingArrayList(Integer arr[], int value) {
		List<Integer> newarr = new ArrayList<Integer>(Arrays.asList(arr));
		newarr.add(value);
		arr = newarr.toArray(arr);
		return arr;
	}
}
