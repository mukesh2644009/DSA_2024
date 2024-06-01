package leetcode;

public class findMaxSubArray {
	
	
	public static void main(String[] args) {
		int num[] = {-2,1,-3,4,-1,2,1,-5,4};
		int result = maxValue(num);
		System.out.println(result);
	}
	
	public static int maxValue(int[] num) {
		int maxsum = num[0];
		int currentsum = num[0];
		
		for(int i=1; i<num.length; i++) {
			
			currentsum = Math.max(num[i], currentsum + num[i]);
			maxsum = Math.max(maxsum, currentsum);
			
			
		}
		
		return maxsum;
	}

}
