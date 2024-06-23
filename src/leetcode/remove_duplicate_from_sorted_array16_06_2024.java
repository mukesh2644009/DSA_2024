package leetcode;

public class remove_duplicate_from_sorted_array16_06_2024 {
	
	public static void main(String[] args) {
		
		int num[] = {1,1,2,3,4,4,4,5};
		System.out.println(removeDuplicates(num));
		
	}
	
	  public static int removeDuplicates(int[] nums) {
	        
		  
		  int n = nums.length;
		  int insert = 1;
		  if(n == 0) {
			  return 0;
		  }
		  for(int i=1; i<n ; i++) {
			  if(nums[i]!=nums[i-1]) {
				  nums[insert] = nums[i];
				  insert ++;
			  }
		  }
		  return  insert;
	    }

}
