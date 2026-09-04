package leetcode;


public class PerfectNumber507 {
	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(7));
		System.out.println(checkPerfectNumber(28));
	}
	
	public static boolean checkPerfectNumber(int num) {
		if(num<0) return false;
		
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum==num;
	}
}
