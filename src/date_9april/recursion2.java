package date_9april;

public class recursion2 {

	public static void main(String[] args) {

		function(1);

	}

	private static void function(int sum) {

		if (sum == 5) {
			return;
		}

		function(sum + 1);
		System.out.println(sum);
	}
}
