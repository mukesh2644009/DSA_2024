package leetcode;

import java.awt.Point;

public class search_insert_position23_06_2024 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 6 };
		System.out.println(searchInsert(a, 5));
	}

	public static int searchInsert(int[] nums, int target) {
		int pivot = 0;
		int left = 0;
		int right = nums.length-1;
		
		while (left <= right) {
			pivot = left + (right-left) /2;
			if(nums[pivot] == target) {
				return pivot;
			} 
			if(target < nums[pivot]) {
				right = pivot-1;
			} else {
				left = pivot + 1;
			}
		}
		return left;

	}
}