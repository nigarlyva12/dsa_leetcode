package leetcode.Strings;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("bbb"));
	}
	 public static int lengthOfLongestSubstring(String s) {
		 String emp = "";
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<s.length()-1; j++) {
				if(s.charAt(j)!=s.charAt(j+1)) {
					emp+=s.charAt(j);
				}
				if(emp.contains(String.valueOf(s.charAt(j+1)))) {
					return emp.length();
				}
			}
		}
		return 0;
	 }
}

/*
 * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the
 * length of 3. Note that "bca" and "cab" are also correct answers.
 */