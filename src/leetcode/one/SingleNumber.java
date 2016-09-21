package leetcode.one;

import java.util.Arrays;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {17,12,5,-6,12,4,17,-5,2,-3,2,4,5,16,-3,-4,15,15,-4,-5,-6};
		System.out.println(singleNumber(input));
	}

	public static int singleNumber(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i += 2) {
			if (nums[i] != nums[i + 1]) {
				return nums[i];
			}
		}
		return nums[nums.length - 1];
	}
	
	
}
