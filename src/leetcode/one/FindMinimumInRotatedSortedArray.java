package leetcode.one;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年7月6日
 */
public class FindMinimumInRotatedSortedArray{
	public static int findMin(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int left = 0;
		int right = nums.length - 1;
		if (nums[left] < nums[right]) {
			return nums[0];
		}
		while (left + 1 != right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] > nums[left]) {
				left = mid;
			}
			if (nums[mid] < nums[right]) {
				right = mid;
			}
		}
		return nums[right];
	}

	public static void main(String[] args) {
		int[] input = { 2, 1 };
		System.out.println(findMin(input));
	}
}
