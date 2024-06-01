package String;

public class MergeStringAlternately_1June {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "pqr";
		int i = 0;
		int j = 0;

		int m = s1.length();
		int n = s2.length();
		StringBuilder s = new StringBuilder();

		while (i < m || j < n) {
			if (i < m) {
				s.append(s1.charAt(i));
				i++;
			}

			if (j < n) {
				s.append(s2.charAt(j));
				j++;
			}
		}

		System.out.println(s.toString());

	}
}
