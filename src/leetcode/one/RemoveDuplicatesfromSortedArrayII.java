package leetcode.one;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月16日
 */
public class RemoveDuplicatesfromSortedArrayII{
	public static int removeDuplicates(int[] nums) {
		if (nums.length < 3) {
			return nums.length;
		}
		int pre = 1;
		int cur = 2;
		while (cur < nums.length) {
			if (nums[cur] == nums[pre] && nums[cur] == nums[pre - 1]) {
				cur++;
			} else {
				pre++;
				nums[pre] = nums[cur];
				cur++;
			}
		}
		return pre + 1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1, 2, 2, 3 };
		System.out.println(removeDuplicates(a));
		System.out.println(a);
	}
}
