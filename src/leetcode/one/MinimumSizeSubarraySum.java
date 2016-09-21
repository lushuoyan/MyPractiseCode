package leetcode.one;

public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int res = Integer.MAX_VALUE;
		int sum = 0, i = 0, j = 0;
		while (i <= j && j < nums.length && sum < s) {
			sum += nums[j];
			while (i <= j && sum >= s) {
				res = Math.min(res, j - i + 1);
				sum -= nums[i];
				i++;
			}
			j++;
		}
		return (res == Integer.MAX_VALUE ? 0 : res);
	}
}
