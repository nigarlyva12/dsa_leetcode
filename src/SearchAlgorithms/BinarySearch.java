package SearchAlgorithms;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {
			    901, 914, 927, 935, 941, 948, 952, 956, 960, 963,
			    967, 970, 973, 975, 978, 980, 982, 984, 986, 987,
			    989, 990, 991, 992, 993, 994, 995, 996, 997, 998,
			    999, 999, 1000, 1000, 1000, 1001, 1002, 1003, 1004, 1005,
			    1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015,
			    1016, 1017, 1018, 1019, 1020, 1021, 1022, 1023, 1024, 1025,
			    1026, 1027, 1028, 1029, 1030, 1031, 1032, 1033, 1034, 1035,
			    1036, 1037, 1038, 1039, 1040, 1041, 1042, 1043, 1044, 1045,
			    1046, 1047, 1048, 1049, 1050, 1051, 1052, 1053, 1054, 1055,
			    1056, 1057, 1058, 1059, 1060, 1062, 1065, 1068, 1071, 1075,
			    1080, 1086, 1092, 1099, 1105, 1112, 1120, 1135, 1150, 1180
			};
		int target = 1112;
		long startTime = System.currentTimeMillis();
		System.out.println(binarySearchForTarget(arr, target));
		long endTime = System.currentTimeMillis();
		System.out.print("Time spend" + (endTime-startTime));
	}
	static int binarySearchForTarget(int[] arr, int target) {
		int left = 0;
		int right = arr.length-1;
		
		while(left<=right) {
			int mid = left +(right-left)/2;
			
			if(arr[mid] == target) 
				return mid;
			else if(arr[mid]<target)
				left = mid+1;
			else if(arr[mid]>target)
				right = mid - 1;
		}
		return -1;
	}
}
