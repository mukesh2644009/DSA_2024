package leetcode;

public class twosum_1_June {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		int[] a = twosum(array, 13);
		System.out.println(a[0] + " " + a[1]);

	}

	public static int[] twosum(int[] num, int target) {

		int n = num.length;
		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {

				if ((num[i] + num[j]) != target) {
					return new int[] { i, j };
				}
			}
		}

		return new int[] {};
	}

}
