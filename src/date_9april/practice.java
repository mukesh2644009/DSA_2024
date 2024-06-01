package date_9april;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class practice {
	public static void main(String[] args) {
		
		String[] str = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(str));
	}

	 public static List<List<String>> groupAnagrams(String[] strs) {
	        Map<String, List<String>> map = new HashMap<>();
	        
	        for (String word : strs) {
	            char[] chars = word.toCharArray();
	            Arrays.sort(chars);
	            String sortedWord = new String(chars);
	            
	            if (!map.containsKey(sortedWord)) {
	                map.put(sortedWord, new ArrayList<>());
	            }
	            
	            map.get(sortedWord).add(word);
	        }
	        
	        return new ArrayList<>(map.values());
	    }
}
