package leetcode.one;

import java.util.Arrays;

public class Sum3Closest {

	public static void main(String[] args) {
		int[] input = { 1, 1, 1, 1 };
		System.out.println(threeSumClosest(input, -100));
	}

	public static int threeSumClosest(int[] nums, int target) {
		if (nums == null || nums.length < 3)
			return 0;

		Arrays.sort(nums);

		int ret = 0;
		int closestDist = Integer.MAX_VALUE;
		int len = nums.length;
		for (int i = 0; i < len - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int l = i + 1, r = len - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (sum < target) {
					if (target - sum < closestDist) {
						closestDist = target - sum;
						ret = sum;
					}
					l++;
				} else if (sum > target) {
					if (sum - target < closestDist) {
						closestDist = sum - target;
						ret = sum;
					}
					r--;
				} else { // when sum == target, return sum.
					return sum;
				}
			}
		}

		return ret;
	}
}
