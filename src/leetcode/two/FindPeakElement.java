package leetcode.two;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月2日
 */
public class FindPeakElement{
	public int findPeakElement(int[] nums) {
		if (nums.length == 0) {
			return -1;
		}
		if (nums.length == 1) {
			return 0;
		}
		if (nums.length == 2) {
			return nums[1] > nums[0] ? 1 : 0;
		}
		int index = 1;
		if (nums[0] > nums[1]) {
			return 0;
		}
		while (true) {
			if (index == nums.length - 1) {
				return index;
			}
			if (nums[index] > nums[index - 1] && nums[index] > nums[index + 1]) {
				return index;
			}
			index++;
		}
	}
}
