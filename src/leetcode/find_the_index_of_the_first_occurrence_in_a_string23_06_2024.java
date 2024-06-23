package leetcode;

public class find_the_index_of_the_first_occurrence_in_a_string23_06_2024 {
	
	public static void main(String[] args) {
		
		String s = "ileetcodeleet";
		System.out.println(strStr(s, "leet"));
		
		
	}
	
	 public static int strStr(String haystack, String needle) {
	        int m = needle.length();
	        int n = haystack.length();

	        for (int windowStart = 0; windowStart <= n - m; windowStart++) {
	            for (int i = 0; i < m; i++) {
	                if (needle.charAt(i) != haystack.charAt(windowStart + i)) {
	                    break;
	                }
	                if (i == m - 1) {
	                    return windowStart;
	                }
	            }
	        }

	        return -1;
	    }

}
