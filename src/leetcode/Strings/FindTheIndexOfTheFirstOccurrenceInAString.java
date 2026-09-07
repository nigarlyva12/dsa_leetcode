package leetcode.Strings;
/*
 * leetcode no 28 
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {
	public static void main(String[] args) {
		System.out.print(strStr("hello", "ll"));
	}
	public static int strStr(String haystack, String needle) {
		int n = haystack.length();
		int m = needle.length();
        for(int i=0; i<=n-m; i++){
            if(haystack.substring(i, i+m).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
