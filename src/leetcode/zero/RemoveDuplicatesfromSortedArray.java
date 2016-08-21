package leetcode.zero;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月13日
 */
public class RemoveDuplicatesfromSortedArray{
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				continue;
			} else {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}
}
