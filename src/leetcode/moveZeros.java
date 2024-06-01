package leetcode;

public class moveZeros {

	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 5, 0, 2, 0 };
		moveZeroes(i);
		for (int num : i) {
			System.out.print(num + " ");
		}
	}

	public static void moveZeroes(int[] nums) {

		// int reader = 0;
		int writter = 0;
		for (int reader = 0; reader < nums.length; reader++) {
			if (nums[reader] != 0) {
				nums[writter] = nums[reader];
				writter++;
			}

		}
		while (writter < nums.length) {
			nums[writter] = 0;
			writter++;
		}

	}
}
