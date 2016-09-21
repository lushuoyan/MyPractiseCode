package leetcode.one;

import java.util.Arrays;

public class SingleNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { -2, -2, 1, 1, -3, 1, -3, -3, -4, -2 };
		System.out.println(singleNumber(input));
	}

	public static int singleNumber(int[] nums) {
		if (nums.length == 1 || nums.length == 2) {
			return nums[0];
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i += 3) {
			if (nums[i] != nums[i + 1] || nums[i + 2] != nums[i + 1]) {
				return nums[i];
			}
		}
		return nums[nums.length - 1];
	}
}
