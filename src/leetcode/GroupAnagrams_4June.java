package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_4June {
	public static void main(String[] args) {
		
		String[] s  = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(s));
		
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> groups= new HashMap<>();
		for(String s: strs) {
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			
			String Key = String.valueOf(chars);
			groups.putIfAbsent(Key, new ArrayList<>());
			groups.get(Key).add(s);
		}
		
		return new ArrayList<>(groups.values());

	}

}
