package SearchAlgorithms;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int target = 1;
		System.out.println(searchForTarget(arr, target));
	}
	
	static boolean searchForTarget(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				return true;
			}
		}
		return false;
	}
}
