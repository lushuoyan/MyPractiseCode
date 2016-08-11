package leetcode.two;

/**
 * 类描述 http://blog.csdn.net/worldwindjp/article/details/39826823
 * 
 * @author luoshuoyan
 * @date 2016年7月6日
 */
public class MaximumProductSubarray{
	public static int maxProduct(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int max = nums[0];
		int min = nums[0];
		int res = nums[0];
		int maxEnd = 0;
		int minEnd = 0;
		for (int i = 1; i < nums.length; i++) {
			maxEnd = max * nums[i];
			minEnd = min * nums[i];
			max = Math.max(Math.max(maxEnd, minEnd), nums[i]);
			min = Math.min(Math.min(maxEnd, minEnd), nums[i]);
			res = Math.max(res, max);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] input = { -2 };
		System.out.println(maxProduct(input));
	}
}
