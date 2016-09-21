package leetcode.one;

public class SearchforaRange {

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		System.out.println(searchRange(nums, 8));
	}

	public static int[] searchRange(int[] nums, int target) {
		int[] result = { -1, -1 };
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				result[0] = i;
				break;
			}
		}

		for (int i = nums.length - 1; i > -1; i--) {
			if (nums[i] == target) {
				result[1] = i;
				break;
			}
		}

		return result;
	}
}
