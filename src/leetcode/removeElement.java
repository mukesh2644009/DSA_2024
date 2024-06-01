package leetcode;

public class removeElement {
	
	public static void main(String[] args) {
		
		int[] i = {1,2,3,4,2,5};
		
		
	System.out.println(removeElement(i, 2));
	}

	
	 public static int removeElement(int[] nums, int val) {
		 //int reader = 0; 
		 int writter=0;
		
		 for(int reader=0; reader < nums.length ; reader++) {
			 if(nums[reader] != val) {
				 nums[writter++] = nums[reader];
			 }
		 }
		 
		 return writter;
		 
		}
	 
	 
	 /*
			 * public static int removeElement(int[] nums, int val) { int reader = 0; int
			 * writter=0; while(reader < nums.length) { if(nums[reader] == val) { reader ++;
			 * } else { nums[writter] = nums[reader]; reader ++; writter ++; } }
			 * 
			 * 
			 * return writter;
			 * 
			 * }
			 */
	 
	 
}
